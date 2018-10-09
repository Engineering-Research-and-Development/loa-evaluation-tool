import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import 'rxjs/add/operator/map';
import { Subscription } from 'rxjs';
import { environment } from '../../environments/environment';
import { Router } from '@angular/router';


@Component({
  selector: 'app-edit-process',
  templateUrl: './edit-process.component.html',
  styleUrls: ['./edit-process.component.css']
})
export class EditProcessComponent implements OnInit {

  selectedModule1: any = null;
  selectedModule2: any = null;
  selectedModule3: any = null;

  processSegmentList:Array<any> = [];
  subProcessesList:Array<any> = [];
  subProcessesListToEdit:Array<any> = [];
  checkEdit1:any =[];
  checkEdit2:any =[];

  main:Array<any> = [];
  subL1:Array<any> = [];
  subL2:Array<any> = [];
  subL3:Array<any> = [];
  lvl1selection:any;
  lvl2selection:any;
  lvl3selection:any;
  private _values1 = [];
  private _values2 = [];
  private _values3 = [];

  fk:any;
  fk2:any;



  constructor(private http: HttpClient, public router: Router) {}

    async ngOnInit() {

      //var processSegmentsSubscription:Subscription =
      this.http
        .get(environment.apiUrl + '/v1/var/process-segments')
        .toPromise()
        .then(
          (processSegments:Array<any>) => {
            this.processSegmentList.push(processSegments);
            //processSegmentsSubscription.unsubscribe();
            this._values1.push(this.subProcessL1('latchValveProduction'));
            this.startDropDownMenu();
          }
        )
    }

    startDropDownMenu() {
       this.http.get(environment.apiUrl + '/v1/subprocess-levels')
        .toPromise()
        .then(
          (subProcessesList:any) => {

            for (let i in subProcessesList) {
              if (subProcessesList[i].fkTbAceProSeq === 4){
                this.fk = subProcessesList[i];
                this.subProcessesList.push(subProcessesList[i]);
                this.selectedModule1 = subProcessesList[i].name;

               }
            }

            for (let j in subProcessesList) {
              if (subProcessesList[j].fkTbAceProSeq === this.fk.pkTbId){
                this.fk2 = subProcessesList[j];
                this._values2 = this.subProcessL2('latchValveProduction',this.selectedModule1);
                this.subProcessesList.push(subProcessesList[j]);
                this.selectedModule2 = subProcessesList[j].name;
               }
            }
            for (let k in subProcessesList) {
              if (subProcessesList[k].fkTbAceProSeq === this.fk2.pkTbId){
                this._values3 = this.subProcessL3('latchValveProduction',this.selectedModule1,this.selectedModule2);
                this.subProcessesList.push(subProcessesList[k]);
                this.selectedModule3 = subProcessesList[k].name;
               }
            }
            //subProcessesSubscription.unsubscribe();
          }
        )
    }

    refresh(): void {
      this._values2 = [];
      this._values3 = [];
      this.lvl1selection = null;
      this.lvl2selection = null;
      this.lvl3selection = null;
    }

    save() {
      this.checkEdit1 = [];
      this.checkEdit2 = [];


      this.subProcessesListToEdit = [];
      if (this.lvl1selection != null)
      this.subProcessesListToEdit.push(this.lvl1selection);
      if (this.lvl2selection != null)
      this.subProcessesListToEdit.push(this.lvl2selection);
      if (this.lvl3selection != null)
      this.subProcessesListToEdit.push(this.lvl3selection);

      if (this.subProcessesList.length === this.subProcessesListToEdit.length){
        for(let i in this.subProcessesList){
          this.checkEdit1.push(this.subProcessesList[i].name);
          this.checkEdit2.push(this.subProcessesListToEdit[i].name);
        }

        if (this.checkEdit1.toString() === this.checkEdit2.toString()){
          alert("Nothing to modify");
        }

      }else{
        for(let i in this.subProcessesList){
          this.deleteSubProccess((this.subProcessesList[i].pkTbId).toString());
        }

          this.addSubProcessL1(4);
          this.router.navigate(['process-list']);
          alert("Process edited successfully");
      }
    }

    deleteSubProccess (pkTbId:string){
      const subProcUrl = environment.apiUrl + '/v1/subprocess-levels/'+pkTbId;
      this.http.delete(subProcUrl).subscribe();
    }

    addSubProcessL1(pkTbId) {

    const subProcUrl = environment.apiUrl + '/v1/subprocess-levels';
    this.http.post(subProcUrl, {"fkTbAceProSeq": pkTbId,"name": this.lvl1selection.name,"varProSeqId": this.lvl1selection.processSegmentId, "proLevel": this.lvl1selection.level})
            .toPromise()
            .then((res:any) => {
              if (res.pkTbId != null) {
                this.addSubProcessL2(res.pkTbId);}
              },
      (err) => {alert('Something went wrong. \nStatus: ' +  err.error.status);});

    }

    addSubProcessL2(pkTbId) {
    const subProcUrl = environment.apiUrl + '/v1/subprocess-levels';

    this.http.post(subProcUrl, {"fkTbAceProSeq": pkTbId,"name": this.lvl2selection.name,"varProSeqId": this.lvl2selection.processSegmentId, "proLevel": this.lvl2selection.level})
           .toPromise()
           .then((res:any) => {
             if (res.pkTbId != null) {
               this.addSubProcessL3(res.pkTbId);}
             },

     (err) => {alert('Something went wrong. \nStatus: ' +  err.error.status);});
    }

    addSubProcessL3(pkTbId) {
    const subProcUrl = environment.apiUrl + '/v1/subprocess-levels';

    this.http.post(subProcUrl, {"fkTbAceProSeq": pkTbId,"name": this.lvl3selection.name,"varProSeqId": this.lvl3selection.processSegmentId, "proLevel": this.lvl3selection.level})
           .toPromise()
           .then((res:any) => {
             if (res.pkTbId != null) {
           }},
     (err) => {alert('Something went wrong. \nStatus: ' +  err.error.status);})

    }

    findObj(obj: any, name: any){
      for (let k in obj) {
        if (obj[k].name === name){
          return obj[k];
         }
      }
    }


    firstDropDownChanged(val: any) {
      const obj = this._values1[0];
      //console.log(val, obj);
      if (!obj) return;

     this._values2 = [];
     this._values3 = [];
     this._values2 = this.subProcessL2('latchValveProduction',this.selectedModule1);
     this.lvl1selection = this.findObj(obj,this.selectedModule1);
    }


     secondDropDownChanged(val2: any) {
      this._values3 = [];
      const obj2 = this._values2;
      //console.log(val, obj);
      if (!obj2) return;
      this._values3 = this.subProcessL3('latchValveProduction',this.selectedModule1,this.selectedModule2);
      this.lvl2selection = this.findObj(obj2,this.selectedModule2);
    }

    thirdDropDownChanged(val3: any) {

     const obj3 = this._values3;
     //console.log(val, obj);
     if (!obj3) return;
     this.lvl3selection = this.findObj(obj3,this.selectedModule3);
    }


    subProcessL1(mainProc){
      this.subL1 = [];
       for (let entry of this.processSegmentList[0]) {
         if (mainProc === entry.name){
           for (let sub of entry.subProcesses) {
              this.subL1.push(sub);
           }
         }
       }
       return this.subL1;
    }


     subProcessL2(mainProc,subProcessL1){
       this.subL2 = [];
         for (let entry of this.processSegmentList[0]) {
           if (mainProc === entry.name){
             for (let sub of entry.subProcesses) {
               if (subProcessL1 === sub.name){
                 for (let sub2 of sub.subProcesses) {
                   this.subL2.push(sub2);
                 }
               }
             }
           }
         }
         return this.subL2;
    }

    subProcessL3(mainProc,subProcessL1,subProcessL2){
     this.subL3 = [];
       for (let entry of this.processSegmentList[0]) {
         if (mainProc === entry.name){
           for (let sub of entry.subProcesses) {
             if (subProcessL1 === sub.name){
               for (let sub2 of sub.subProcesses) {
                 if (subProcessL2 === sub2.name){
                   for (let sub3 of sub2.subProcesses) {
                     this.subL3.push(sub3);
                   }
                 }
               }
             }
           }
         }
       }
       return this.subL3;
    }
}

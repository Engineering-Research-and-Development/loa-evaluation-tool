import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import 'rxjs/add/operator/map';
import { Subscription } from 'rxjs';
import { environment } from '../../environments/environment';
import { CookieService } from '../cookie.service';

@Component({
  selector: 'app-scenarios',
  templateUrl: './scenarios.component.html',
  styleUrls: ['./scenarios.component.css']
})
export class ScenariosComponent implements OnInit {

  constructor(private http: HttpClient, private _processListService: CookieService) { }

  resSubSceList:Array<any> = [];
  subSceList:Array<any> = [];
  cookie: any;
  objlist:any={};
  subProc:any;
  scenNumber:any;
  processSegmentList: Array<any> = [];
  allProcessSegmentCAM: Array<any> = [];

  ngOnInit() {
    this.cookie = this._processListService.getCookie("selectedSubprocess");

    var waitCAMProcTree = this.fetchFromCAM();
    waitCAMProcTree.then((x)=>{
      this.findMissingSegments();
      this.checkduplicate();
    });

    var waitScenarioList = this.getScenariosList();
    waitScenarioList.then((x)=>{
        this.creteTable();
        console.log(this.subSceList[0]);
        this.deleteDupicate();
    });
  }

  creteTable(){
    for(let i in this.resSubSceList[0]){
      this.objlist= {};
      if(this.resSubSceList[0][i].fkTbAceProSeq === this.cookie.mainProcessId){
          for(let j in this.resSubSceList[0]){
              if(this.resSubSceList[0][i].subprocessLevel.pkTbId === this.resSubSceList[0][j].subprocessLevel.pkTbId){
                if(this.resSubSceList[0][j].scenarioNumber === 1){
                  this.objlist['scenNumber1'] = this.resSubSceList[0][j];
                }
                if(this.resSubSceList[0][j].scenarioNumber === 2){
                  this.objlist['scenNumber2'] = this.resSubSceList[0][j];
                }
                if(this.resSubSceList[0][j].scenarioNumber === 3){
                  this.objlist['scenNumber3'] = this.resSubSceList[0][j];
                }
              }
          }
            this.subProc = {"subProc": this.resSubSceList[0][i], "objList": this.objlist};
            this.subSceList.push(this.subProc);
      }
    }
  }

  deleteDupicate(){
    var result = this.subSceList.filter(function (a) {
          return !this[a.subProc.subprocessLevel.pkTbId] && (this[a.subProc.subprocessLevel.pkTbId] = true);
      }, Object.create(null));
    this.subSceList = result;
  }

  getScenariosList() {
    return this.http
      .get(environment.apiUrl + '/v1/subscenarios')
      .toPromise()
      .then(
        (res:any) => {
            this.resSubSceList.push(res);
        }
      )
  }

  fetchFromCAM() {

    return this.http
      .get(environment.apiUrl + '/v1/var/process-segments')
      .toPromise()
      .then(
        (processSegments:any) => {
          this.processSegmentList.push(processSegments);
        }
      );
  }

  findMissingSegments(){
    for(let i in this.processSegmentList[0]){
      if (this.processSegmentList[0][i].name === this.cookie.mainProcessName){
        for (let j in this.processSegmentList[0][i].subProcesses){
          this.loop(this.processSegmentList[0][i].subProcesses[j].subProcesses);
        }
      }
    }
  }

  loop(camList:any){
    if (camList.length === 0){
    	return;
    }

    for (let j in camList){
      this.allProcessSegmentCAM.push(camList[j].name);
      this.loop(camList[j].subProcesses);
    }
  }

  checkduplicate(){
    var tmpList = [];
    var tmpList2 = [];

    for(let i in this.subSceList){
        tmpList.push(this.subSceList[i].subProc.subprocessLevel.name);
      }

    for(let i in this.allProcessSegmentCAM){
        if(!tmpList.includes(this.allProcessSegmentCAM[i])){
            tmpList2.push(this.allProcessSegmentCAM[i]);
        }
      }
      this.allProcessSegmentCAM = tmpList2;
    }

}

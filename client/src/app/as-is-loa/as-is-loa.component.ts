import { environment } from './../../environments/environment';
import { HttpClient } from '@angular/common/http';
import { StateHolderService } from '../state-holder.service';
import { Component, OnInit } from '@angular/core';
import { Chart } from '../../../node_modules/chart.js/dist/Chart.min.js';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-as-is-loa',
  templateUrl: './as-is-loa.component.html',
  styleUrls: ['./as-is-loa.component.css']
})
export class AsIsLOAComponent implements OnInit {

  constructor(
    private http:HttpClient,
    private stateHolder:StateHolderService
  ) {}

  title = 'LoA Graph';

  bubbleChart:any;

  data = { datasets: [] };

  ngOnInit() {
    const data = this.data;
    this.bubbleChart = new Chart('bubbleChart', {
      type: 'bubble',
      data,
      options: {
        scales: {
          yAxes: [
            {
              ticks: {
                beginAtZero: true,
                stepSize: 0.5,
                suggestedMax: 7
              },
              scaleLabel: {
                display: true,
                labelString: 'Cognitive LoA'
              }
            }
          ],
          xAxes: [
            {
              ticks: {
                beginAtZero: true,
                stepSize: 0.5,
                suggestedMax: 7
              },
              scaleLabel: {
                display: true,
                labelString: 'Physical LoA'
              }
            }
          ]
        },
        title: {
          display: false,
          text: 'Moj chart',
          position: 'top'
        }
      }
    });

    const bubbleChart = this.bubbleChart;

    const subprocesses:Array<any> = this.stateHolder.read();

    subprocesses.forEach(
      (subprocess) => {
        let subscription:Subscription = this.http
          .get(`${environment.apiUrl}/v1/subprocess-levels/${subprocess.pkTbId}/info`)
          .subscribe({
            next: (info:any) => {
              data.datasets.push({
                label: subprocess.name,
                backgroundColor: 'orange',
                borderColor: 'black',
                borderWidth: 1,
                data: [
                  {
                    x: info.fkTbAcePhyLoa,
                    y: info.fkTbAceCogLoa,
                    r: 10
                  }
                ]
              });
              bubbleChart.update();
            },
            error: () => {},
            complete: () => {
              subscription.unsubscribe();
            }
          })
      }
    );
  }
}

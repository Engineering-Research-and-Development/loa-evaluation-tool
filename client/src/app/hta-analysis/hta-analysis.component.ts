import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hta-analysis',
  templateUrl: './hta-analysis.component.html',
  styleUrls: ['./hta-analysis.component.css']
})
export class HTAAnalysisComponent implements OnInit {

  // columns = [];
  rows = [
    {
      strong: 'Dimensional stabilty',
      criteria1: 'Stable',
      criteria2: 'Reduced stability',
      criteria3: 'Hardly stable',
      criteria4: 'Unstable',
      klass: 'success'
    },
    {
      strong: 'Sensitivity',
      criteria1: 'Insesitive',
      criteria2: 'Handly sensitive',
      criteria3: 'Sensitive',
      criteria4: 'Very sensitive',
      klass: 'success'
    },
    {
      strong: 'Grip',
      criteria1: 'External grip surfaces',
      criteria2: 'Internal grip surfaces',
      criteria3: 'Magnetic grip surfaces',
      criteria4: 'Fabric closure gripper',
      klass: 'success'
    },
    {
      strong: 'No. of variants',
      criteria1: 'No futher variants',
      criteria2: 'One further variant',
      criteria3: 'Two further variants',
      criteria4: 'More than two variants',
      klass: 'success'
    },
    {
      strong: 'Stable positions',
      criteria1: 'Up until four',
      criteria2: 'More than four',
      criteria3: 'Stable and unstable',
      criteria4: 'Only stable',
      klass: 'success'
    },
    {
      strong: 'Symmetry',
      criteria1: 'Rotationally symmetrical',
      criteria2: 'Areal symmetry',
      criteria3: 'Markedly asymmetrical',
      criteria4: 'Seemingly symmetrical',
      klass: 'success'
    },
    {
      strong: 'Hook up or adhesion',
      criteria1: 'None',
      criteria2: 'Sticking or jamming possible',
      criteria3: 'Component penetration possible',
      criteria4: 'Seemingly symmetry',
      klass: 'success'
    },
    {
      strong: 'Faulty joining',
      criteria1: 'Never',
      criteria2: 'Occasionaly',
      criteria3: 'Rarely',
      criteria4: 'Often',
      klass: 'success'
    },
    {
      strong: 'Accessibility',
      criteria1: 'Very good',
      criteria2: 'Good',
      criteria3: 'Satisfactory',
      criteria4: 'Sufficient',
      klass: 'success'
    },
    {
      strong: 'Orienation',
      criteria1: 'No axis',
      criteria2: 'One axis',
      criteria3: 'Two axis',
      criteria4: 'Three axis',
      klass: 'success'
    },
    {
      strong: 'Joining mov.',
      criteria1: 'Linear',
      criteria2: 'Rotation',
      criteria3: 'Linear-rotatory',
      criteria4: 'Path movement',
      klass: 'success'
    },
    {
      strong: 'Joining force',
      criteria1: 'None',
      criteria2: 'Low',
      criteria3: 'Medium',
      criteria4: 'High',
      klass: 'success'
    },
    {
      strong: 'Joining aid',
      criteria1: 'Joining and basic component',
      criteria2: 'Joining component',
      criteria3: 'Basic component',
      criteria4: 'None',
      klass: 'success'
    },
    {
      strong: 'Number of basic components',
      criteria1: 'One basic component',
      criteria2: 'Two basic components',
      criteria3: 'Three basic components',
      criteria4: 'More than three basic components',
      klass: 'success'
    },
    {
      strong: 'Joining security',
      criteria1: 'Secured in all directions',
      criteria2: 'Gravity and form fit',
      criteria3: 'Gravity and form fit',
      criteria4: 'Additional securing necessary',
      klass: 'success'
    },
    {
      strong: 'Special operations',
      criteria1: 'None',
      criteria2: 'One',
      criteria3: 'Two',
      criteria4: 'More than two',
      klass: 'success'
    }
  ];

  selectedIndex;
  status;
  preSelected;
  selected: boolean;
  selectedRow = [];

  check(data) {
    console.log(data);
  }

 changeColor() {
    // this.selectedIndex = i;
    // this.selected = id;
    // console.log('selectedIndex=' + this.selectedIndex + ' i=' + i + ' id=' + id + ' seleected=' + this.selected);
    this.selected = !this.selected;

  }

  toggleClass() {
    this.status = !this.status;
  }

  changeBG(val) { // on tr element
    // val is event.target
    let table = document.querySelector('#table2');
    let selectedCells = table.getElementsByClassName('on');
    if (val.tagName !== 'TD') {
        return;
      }
    if (selectedCells.length) {
      selectedCells[0].className = '';
    }
    val.className = 'on';
  }




  constructor() { }

  ngOnInit() {
  }

  // test(x) {console.log(x)}
}

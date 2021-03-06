import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ProcessListComponent} from './process-list/process-list.component';
import { AddProcessComponent } from './add-process/add-process.component';
import { EditProcessComponent } from './edit-process/edit-process.component';
import { AsIsLOAComponent } from './as-is-loa/as-is-loa.component';
import { ResourceListComponent } from './resource-list/resource-list.component';
import { MainAnalysisComponent } from './main-analysis/main-analysis.component';
import { HTAAnalysisComponent } from './hta-analysis/hta-analysis.component';
import { AddResourceComponent } from './add-resource/add-resource.component';
import { EditResourceComponent } from './edit-resource/edit-resource.component';
import { SubScenariosComponent } from './sub-scenarios/sub-scenarios.component';
import { ScenariosComponent } from './scenarios/scenarios.component';
import { AddScenarioComponent } from './add-scenario/add-scenario.component';
import { EditScenarioComponent } from './edit-scenario/edit-scenario.component';
import { SubScenariosSortingComponent } from './sub-scenarios-sorting/sub-scenarios-sorting.component';
import { CriteriaMatrixComponent } from './criteria-matrix/criteria-matrix.component';



const ROUTES: Routes = [
  { path: '', redirectTo: '/process-list', pathMatch: 'full' },
  { path: 'process-list', component: ProcessListComponent },
  { path: 'add-process/:id', component: AddProcessComponent },
  { path: 'edit-process/:id', component: EditProcessComponent },
  { path: 'as-is-loa', component: AsIsLOAComponent },
  { path: 'resource-list', component: ResourceListComponent },
  { path: 'main-analysis', component: MainAnalysisComponent},
  { path: 'hta-analysis', component: HTAAnalysisComponent },
  { path: 'add-resource', component: AddResourceComponent },
  { path: 'edit-resource/:resourceId', component: EditResourceComponent },
  { path: 'sub-scenarios', component: SubScenariosComponent },
  { path: 'scenarios', component: ScenariosComponent },
  { path: 'add-scenario/:id', component: AddScenarioComponent },
  { path: 'edit-scenario/:id', component: EditScenarioComponent },
  { path: 'sub-scenarios-sorting', component: SubScenariosSortingComponent },
  { path: 'criteria-matrix', component: CriteriaMatrixComponent }

];

@NgModule({
  imports: [
    RouterModule.forRoot(ROUTES)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }

import { Component, OnInit } from '@angular/core';
import { LinkService } from './link.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{

  public msg: string;
  constructor(private linkService: LinkService) {}

  ngOnInit() {
    this.linkService.getIndexPage().subscribe((res: any) => {
      // this.msg = res.response;
      this.msg = res.data;
    });
  }

}

<%@ page pageEncoding="utf-8" session="false"%>
<!-- Sidebar -->
      <ul class="sidebar navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="index.html">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>공지 사항</span>
          </a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-fw fa-folder"></i>
            <span>인사 관리</span>
          </a>
          <div class="dropdown-menu" aria-labelledby="pagesDropdown">
            <h6 class="dropdown-header">사용자 인사 관리 메뉴</h6>
            <a class="dropdown-item" href="home_main">인사 현황</a>
            <a class="dropdown-item" href="#">휴가 신청</a>
          </div>
        </li>
        <!-- <li class="nav-item active"> remove active 20190-01-29 by Dan-->
        <li class="nav-item">
          <a class="nav-link" href="#">
            <i class="fas fa-fw fa-folder"></i>
            <span>급여 관리</span></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="testPage">
            <i class="fas fa-fw fa-table"></i>
            <span>테스트 페이지</span></a>
        </li>
      </ul>
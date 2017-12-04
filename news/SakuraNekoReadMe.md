## SakuraNeko（张仲昊）

### 回顾
这是自己的第二次在武汉参加Hackathon了，这次自己主要在这个项目里面负责搭建后台、处理后台数据、以及将可视化的数据展现给移动端APP。在这次的技术分析里面我就来讲讲这方面内容。

### 技术栈
本次的项目中后台使用Node的Express框架，数据库使用了较为方便的Sqlite，而返还给前端的webview页面是使用Echarts制作的数据可视化页面。而获取知乎的数据源使用了7sDream的zhihu-oauth项目。中文语意的处理使用了Bosonnlp的分析接口。

### 具体实现
通过zhihu-oauth抓取知乎评论数据。并将数据通过Bosonnlp处理后放入数据库中。然后通过Express获取数据源，通过接口交给移动端。
前端方面通过Echarts将数据可视化后生成jade渲染传给移动端。

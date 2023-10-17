# landevu

「待ち合わせ、ここにしよっか」

## features

それぞれの出発地点で検索すると、ちょうどいい待ち合わせ場所をレコメンドする

```demo
$ curl -X POST http://localhost:8080/v1/areas/recommend -H "Content-Type: application/json" -d '{"spotNames": ["原宿駅", "恵比寿駅"]}'
$ {"areas":[{"area":{"areaId":"area130020","areaName":"渋谷"},"spot":{"spotId":"spot000020","spotName":"JR渋谷駅","areaId":"area130020","coordinate":{"longitude":139.70133399999997,"latitude":35.658517}}}]}
```
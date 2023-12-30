--データ挿入
insert into areas values ('area130001', '東京');
insert into areas values ('area130002', '神田');
insert into areas values ('area130003', '秋葉原');
insert into areas values ('area130004', '御徒町');
insert into areas values ('area130005', '上野');
insert into areas values ('area130006', '鶯谷');
insert into areas values ('area130007', '日暮里');
insert into areas values ('area130008', '西日暮里');
insert into areas values ('area130009', '田端');
insert into areas values ('area130010', '駒込');
insert into areas values ('area130011', '巣鴨');
insert into areas values ('area130012', '大塚');
insert into areas values ('area130013', '池袋');
insert into areas values ('area130014', '目白');
insert into areas values ('area130015', '高田馬場');
insert into areas values ('area130016', '新大久保');
insert into areas values ('area130017', '新宿');
insert into areas values ('area130018', '代々木');
insert into areas values ('area130019', '原宿');
insert into areas values ('area130020', '渋谷');
insert into areas values ('area130021', '恵比寿');
insert into areas values ('area130022', '目黒');
insert into areas values ('area130023', '五反田');
insert into areas values ('area130024', '大崎');
insert into areas values ('area130025', '品川');
insert into areas values ('area130026', '高輪ゲートウェイ');
insert into areas values ('area130027', '田町');
insert into areas values ('area130028', '浜松町');
insert into areas values ('area130029', '新橋');
insert into areas values ('area130030', '有楽町');

insert into spots values ('spot000001', 'JR東京駅', 'area130001', 139.76608399999998, 35.681382);
insert into spots values ('spot000002', 'JR神田駅', 'area130002', 139.77088300000003, 35.69169);
insert into spots values ('spot000003', 'JR秋葉原駅', 'area130003', 139.77421900000002, 35.698683);
insert into spots values ('spot000004', 'JR御徒町駅', 'area130004', 139.774632, 35.707438);
insert into spots values ('spot000005', 'JR上野駅', 'area130005', 139.77725399999997, 35.713768);
insert into spots values ('spot000006', 'JR鶯谷駅', 'area130006', 139.77883700000007, 35.720495);
insert into spots values ('spot000007', 'JR日暮里駅', 'area130007', 139.770987, 35.727772);
insert into spots values ('spot000008', 'JR西日暮里駅', 'area130008', 139.76678700000002, 35.732135);
insert into spots values ('spot000009', 'JR田端駅', 'area130009', 139.76085999999998, 35.738062);
insert into spots values ('spot000010', 'JR駒込駅', 'area130010', 139.74687500000005, 35.736489);
insert into spots values ('spot000011', 'JR巣鴨駅', 'area130011', 139.73934499999996, 35.733492);
insert into spots values ('spot000012', 'JR大塚駅', 'area130012', 139.72866199999999, 35.731401);
insert into spots values ('spot000013', 'JR池袋駅', 'area130013', 139.71038, 35.728926);
insert into spots values ('spot000014', 'JR目白駅', 'area130014', 139.706587, 35.721204);
insert into spots values ('spot000015', 'JR高田馬場駅', 'area130015', 139.70378200000005, 35.712285);
insert into spots values ('spot000016', 'JR新大久保駅', 'area130016', 139.70004399999993, 35.701306);
insert into spots values ('spot000017', 'JR新宿駅', 'area130017', 139.70025799999996, 35.690921);
insert into spots values ('spot000018', 'JR代々木駅', 'area130018', 139.702042, 35.683061);
insert into spots values ('spot000019', 'JR原宿駅', 'area130019', 139.70268699999997, 35.670168);
insert into spots values ('spot000020', 'JR渋谷駅', 'area130020', 139.70133399999997, 35.658517);
insert into spots values ('spot000021', 'JR恵比寿駅', 'area130021', 139.710106, 35.64669);
insert into spots values ('spot000022', 'JR目黒駅', 'area130022', 139.715828, 35.633998);
insert into spots values ('spot000023', 'JR五反田駅', 'area130023', 139.72344399999997, 35.626446);
insert into spots values ('spot000024', 'JR大崎駅', 'area130024', 139.72855300000003, 35.6197);
insert into spots values ('spot000025', 'JR品川駅', 'area130025', 139.74044000000004, 35.630152);
insert into spots values ('spot000026', 'JR高輪ゲートウェイ駅', 'area130026', 139.7407245, 35.6355406);
insert into spots values ('spot000027', 'JR田町駅', 'area130027', 139.74757499999998, 35.645736);
insert into spots values ('spot000028', 'JR浜松町駅', 'area130028', 139.756749, 35.655646);
insert into spots values ('spot000029', 'JR新橋駅', 'area130029', 139.75964, 35.665498);
insert into spots values ('spot000030', 'JR有楽町駅', 'area130030', 139.763328, 35.675069);

insert into train_lines values ('tl001', 'JR東海道線');
insert into train_lines values ('tl002', 'JR横須賀線・総武線快速');
insert into train_lines values ('tl003', 'JR京浜東北線・根岸線');
insert into train_lines values ('tl004', 'JR横浜線');
insert into train_lines values ('tl005', 'JR南武線');
insert into train_lines values ('tl006', 'JR鶴見線');
insert into train_lines values ('tl007', 'JR山手線');
insert into train_lines values ('tl008', 'JR中央線快速・青梅線・五日市線');
insert into train_lines values ('tl009', 'JR中央線各停・総武線各停');
insert into train_lines values ('tl010', 'JR宇都宮線・高崎線');
insert into train_lines values ('tl011', 'JR埼京線');
insert into train_lines values ('tl012', 'JR常磐線快速');
insert into train_lines values ('tl013', 'JR常磐線各停');
insert into train_lines values ('tl014', 'JR京葉線');
insert into train_lines values ('tl015', 'JR武蔵野線');
insert into train_lines values ('tl016', 'JR湘南新宿ライン');
insert into train_lines values ('tl017', '都営大江戸線');
insert into train_lines values ('tl018', '都営浅草線');
insert into train_lines values ('tl019', '都営三田線');
insert into train_lines values ('tl020', '都営新宿線');
insert into train_lines values ('tl021', '東京さくらとらむ（都電荒川線）');
insert into train_lines values ('tl022', '日暮里・舎人ライナー');
insert into train_lines values ('tl023', '東京メトロ銀座線');
insert into train_lines values ('tl024', '東京メトロ丸ノ内線');
insert into train_lines values ('tl025', '東京メトロ日比谷線');
insert into train_lines values ('tl026', '東京メトロ東西線');
insert into train_lines values ('tl027', '東京メトロ千代田線');
insert into train_lines values ('tl028', '東京メトロ有楽町線');
insert into train_lines values ('tl029', '東京メトロ半蔵門線');
insert into train_lines values ('tl030', '東京メトロ南北線');
insert into train_lines values ('tl031', '東京メトロ副都心線');

insert into stations values ('sta00001', '東京駅', 'tl007', 'area130001');
insert into stations values ('sta00002', '神田駅', 'tl007', 'area130002');
insert into stations values ('sta00003', '秋葉原駅', 'tl007', 'area130003');
insert into stations values ('sta00004', '御徒町駅', 'tl007', 'area130004');
insert into stations values ('sta00005', '上野駅', 'tl007', 'area130005');
insert into stations values ('sta00006', '鶯谷駅', 'tl007', 'area130006');
insert into stations values ('sta00007', '日暮里駅', 'tl007', 'area130007');
insert into stations values ('sta00008', '西日暮里駅', 'tl007', 'area130008');
insert into stations values ('sta00009', '田端駅', 'tl007', 'area130009');
insert into stations values ('sta00010', '駒込駅', 'tl007', 'area130010');
insert into stations values ('sta00011', '巣鴨駅', 'tl007', 'area130011');
insert into stations values ('sta00012', '大塚駅', 'tl007', 'area130012');
insert into stations values ('sta00013', '池袋駅', 'tl007', 'area130013');
insert into stations values ('sta00014', '目白駅', 'tl007', 'area130014');
insert into stations values ('sta00015', '高田馬場駅', 'tl007', 'area130015');
insert into stations values ('sta00016', '新大久保駅', 'tl007', 'area130016');
insert into stations values ('sta00017', '新宿駅', 'tl007', 'area130017');
insert into stations values ('sta00018', '代々木駅', 'tl007', 'area130018');
insert into stations values ('sta00019', '原宿駅', 'tl007', 'area130019');
insert into stations values ('sta00020', '渋谷駅', 'tl007', 'area130020');
insert into stations values ('sta00021', '恵比寿駅', 'tl007', 'area130021');
insert into stations values ('sta00022', '目黒駅', 'tl007', 'area130022');
insert into stations values ('sta00023', '五反田駅', 'tl007', 'area130023');
insert into stations values ('sta00024', '大崎駅', 'tl007', 'area130024');
insert into stations values ('sta00025', '品川駅', 'tl007', 'area130025');
insert into stations values ('sta00026', '高輪ゲートウェイ駅', 'tl007', 'area130026');
insert into stations values ('sta00027', '田町駅', 'tl007', 'area130027');
insert into stations values ('sta00028', '浜松町駅', 'tl007', 'area130028');
insert into stations values ('sta00029', '新橋駅', 'tl007', 'area130029');
insert into stations values ('sta00030', '有楽町駅', 'tl007', 'area130030');
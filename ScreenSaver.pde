// マウスを操作したら終了する
int cnt = 0;
void mouseMoved(){
  cnt++;
  if (cnt > 10){
    exit();
  }
}

void mousePressed(){
  exit();
}

// キーボードを操作したら終了する
void keyPressed(){
  exit();
}

// セットアップ
void setup(){
  size(800, 800);
  background(#000000);
  frameRate(30);
}

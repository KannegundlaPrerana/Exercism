export class translator {
  static translate(sentence) {
  	let words = sentence.split(" ") , result = "" , index;
    for(index = 0; index < words.length - 1; index++){
      result += this.translateAWord(words[index]) + " ";
    }
    result += this.translateAWord(words[index]);
    return result;
  }

  static translateAWord(word){
    let vowels = "aeiou" , requiredIndex , firstTwoCharacters = word.substring(0,2);
    if(vowels.indexOf(word[0]) != -1 || firstTwoCharacters == "xr" || firstTwoCharacters == "yt"){
      requiredIndex = 0;
    }
    else if(word.indexOf("qu") != -1){
      requiredIndex = word.indexOf("qu") + 2;
    }
    else{
      let index = 0 , length = word.length , yIndex = word.indexOf("y");
      while(vowels.indexOf(word[index]) == -1 && index < length){
        index ++;
      }
      if(index != 5){
        requiredIndex = index;
      }   
      if((yIndex != -1) && (yIndex != 0) && (yIndex < requiredIndex)){
        requiredIndex = yIndex;
      }
    }
    return word.substring(requiredIndex,word.length) + word.substring(0,requiredIndex) + "ay";
  }
}

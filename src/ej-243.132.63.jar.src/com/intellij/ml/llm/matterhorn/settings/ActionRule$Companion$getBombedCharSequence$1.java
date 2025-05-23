/*    */ package com.intellij.ml.llm.matterhorn.settings;
/*    */ 
/*    */ import com.intellij.openapi.util.text.StringUtil;
/*    */ import java.util.concurrent.TimeoutException;
/*    */ import kotlin.Metadata;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\024¨\006\004"}, d2 = {"com/intellij/ml/llm/matterhorn/settings/ActionRule$Companion$getBombedCharSequence$1", "Lcom/intellij/openapi/util/text/StringUtil$BombedCharSequence;", "checkCanceled", "", "core"})
/*    */ public final class ActionRule$Companion$getBombedCharSequence$1
/*    */   extends StringUtil.BombedCharSequence
/*    */ {
/*    */   ActionRule$Companion$getBombedCharSequence$1(String $text, long $untilTime) {
/* 16 */     super($text);
/*    */   } protected void checkCanceled() {
/* 18 */     long l = System.currentTimeMillis();
/* 19 */     if (l >= this.$untilTime)
/* 20 */       throw new TimeoutException(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\settings\ActionRule$Companion$getBombedCharSequence$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
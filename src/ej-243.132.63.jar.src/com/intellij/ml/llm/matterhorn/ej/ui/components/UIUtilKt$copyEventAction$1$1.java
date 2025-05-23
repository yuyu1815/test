/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ 
/*    */ import androidx.compose.ui.input.key.Key;
/*    */ import androidx.compose.ui.input.key.KeyEvent;
/*    */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*    */ import com.intellij.openapi.util.SystemInfo;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class UIUtilKt$copyEventAction$1$1
/*    */   implements Function1<KeyEvent, Boolean>
/*    */ {
/*    */   public final Boolean invoke-ZmokQxo(Object keyEvent) {
/* 53 */     Intrinsics.checkNotNullParameter(keyEvent, "keyEvent"); boolean isMac = SystemInfo.isMac;
/* 54 */     boolean isKeyC = Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(keyEvent), Key.Companion.getC-EK5gGoQ());
/*    */     
/* 56 */     if ((isMac && KeyEvent_desktopKt.isMetaPressed-ZmokQxo(keyEvent) && isKeyC) || (!isMac && KeyEvent_desktopKt.isCtrlPressed-ZmokQxo(keyEvent) && isKeyC)) {
/* 57 */       this.$onClick.invoke();
/*    */     }
/*    */     
/* 60 */     return Boolean.valueOf(false);
/*    */   }
/*    */   
/*    */   UIUtilKt$copyEventAction$1$1(Function0<Unit> $onClick) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\UIUtilKt$copyEventAction$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
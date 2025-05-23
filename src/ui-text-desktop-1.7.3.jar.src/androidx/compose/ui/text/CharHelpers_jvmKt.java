/*    */ package androidx.compose.ui.text;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.text.CharDirectionality;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\002\020\b\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\032\020\020\000\032\0020\001*\0060\002j\002`\003H\002\032\020\020\004\032\0020\005*\0060\002j\002`\003H\000\032\025\020\006\032\0020\007*\0060\002j\002`\003H\000¢\006\002\020\b¨\006\t"}, d2 = {"getDirectionality", "Lkotlin/text/CharDirectionality;", "", "Landroidx/compose/ui/text/CodePoint;", "isNeutralDirection", "", "strongDirectionType", "Landroidx/compose/ui/text/StrongDirectionType;", "(I)I", "ui-text"})
/*    */ public final class CharHelpers_jvmKt
/*    */ {
/*    */   public static final int strongDirectionType(int $this$strongDirectionType) {
/* 24 */     switch (WhenMappings.$EnumSwitchMapping$0[getDirectionality($this$strongDirectionType).ordinal()]) {
/*    */       case 1:
/*    */       
/*    */       case 2:
/*    */       case 3:
/*    */       
/* 30 */     }  return StrongDirectionType.Companion.getNone-JKYp3V4();
/*    */   }
/*    */   public static final boolean isNeutralDirection(int $this$isNeutralDirection) {
/* 33 */     switch (WhenMappings.$EnumSwitchMapping$0[getDirectionality($this$isNeutralDirection).ordinal()]) {
/*    */       case 4:
/*    */       case 5:
/*    */       case 6:
/*    */       
/* 38 */     }  return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final CharDirectionality getDirectionality(int $this$getDirectionality) {
/* 45 */     return CharDirectionality.Companion.valueOf(Character.getDirectionality($this$getDirectionality));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\CharHelpers_jvmKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package org.jetbrains.jewel.foundation.state;
/*    */ 
/*    */ import androidx.compose.ui.state.ToggleableState;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ULong;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\021\020\004\032\0020\005*\0020\006¢\006\004\b\007\020\b¨\006\t"}, d2 = {"Lorg/jetbrains/jewel/foundation/state/ToggleableComponentState$Companion;", "", "<init>", "()V", "readToggleableState", "Landroidx/compose/ui/state/ToggleableState;", "Lkotlin/ULong;", "readToggleableState-VKZWuLQ", "(J)Landroidx/compose/ui/state/ToggleableState;", "foundation"})
/*    */ public final class Companion
/*    */ {
/*    */   @NotNull
/*    */   public final ToggleableState readToggleableState-VKZWuLQ(long $this$readToggleableState_u2dVKZWuLQ) {
/* 18 */     boolean selected = (ULong.constructor-impl($this$readToggleableState_u2dVKZWuLQ & CommonStateBitMask.INSTANCE.getSelected-s-VKNKU()) != 0L);
/* 19 */     boolean indeterminate = (ULong.constructor-impl($this$readToggleableState_u2dVKZWuLQ & CommonStateBitMask.INSTANCE.getIndeterminate-s-VKNKU()) != 0L);
/*    */     
/* 21 */     return 
/* 22 */       indeterminate ? ToggleableState.Indeterminate : (
/* 23 */       selected ? ToggleableState.On : 
/* 24 */       ToggleableState.Off);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\state\ToggleableComponentState$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
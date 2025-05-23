/*    */ package org.jetbrains.jewel.foundation.state;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\004\bf\030\000 \n2\0020\001:\001\nR\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\024\020\006\032\0020\0078VX\004¢\006\006\032\004\b\006\020\bR\024\020\t\032\0020\0078VX\004¢\006\006\032\004\b\t\020\b¨\006\013"}, d2 = {"Lorg/jetbrains/jewel/foundation/state/ToggleableComponentState;", "", "toggleableState", "Landroidx/compose/ui/state/ToggleableState;", "getToggleableState", "()Landroidx/compose/ui/state/ToggleableState;", "isSelected", "", "()Z", "isSelectedOrIndeterminate", "Companion", "foundation"})
/*    */ public interface ToggleableComponentState { @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   @NotNull
/*    */   ToggleableState getToggleableState();
/*    */   boolean isSelected();
/*    */   boolean isSelectedOrIndeterminate();
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls { public static boolean isSelected(@NotNull ToggleableComponentState $this) {
/* 11 */       return ($this.getToggleableState() == ToggleableState.On);
/*    */     }
/*    */     public static boolean isSelectedOrIndeterminate(@NotNull ToggleableComponentState $this) {
/* 14 */       return ($this.getToggleableState() != ToggleableState.Off);
/*    */     } } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\021\020\004\032\0020\005*\0020\006¢\006\004\b\007\020\b¨\006\t"}, d2 = {"Lorg/jetbrains/jewel/foundation/state/ToggleableComponentState$Companion;", "", "<init>", "()V", "readToggleableState", "Landroidx/compose/ui/state/ToggleableState;", "Lkotlin/ULong;", "readToggleableState-VKZWuLQ", "(J)Landroidx/compose/ui/state/ToggleableState;", "foundation"})
/*    */   public static final class Companion { @NotNull
/*    */     public final ToggleableState readToggleableState-VKZWuLQ(long $this$readToggleableState_u2dVKZWuLQ) {
/* 18 */       boolean selected = (ULong.constructor-impl($this$readToggleableState_u2dVKZWuLQ & CommonStateBitMask.INSTANCE.getSelected-s-VKNKU()) != 0L);
/* 19 */       boolean indeterminate = (ULong.constructor-impl($this$readToggleableState_u2dVKZWuLQ & CommonStateBitMask.INSTANCE.getIndeterminate-s-VKNKU()) != 0L);
/*    */       
/* 21 */       return 
/* 22 */         indeterminate ? ToggleableState.Indeterminate : (
/* 23 */         selected ? ToggleableState.On : 
/* 24 */         ToggleableState.Off);
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\state\ToggleableComponentState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
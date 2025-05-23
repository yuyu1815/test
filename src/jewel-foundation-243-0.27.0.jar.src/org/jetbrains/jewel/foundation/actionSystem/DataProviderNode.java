/*    */ package org.jetbrains.jewel.foundation.actionSystem;
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0332\0020\0012\0020\0022\0020\003:\001\033B \022\027\020\004\032\023\022\004\022\0020\006\022\004\022\0020\0070\005¢\006\002\b\b¢\006\004\b\t\020\nJ\020\020\024\032\0020\0072\006\020\025\032\0020\026H\026R+\020\004\032\023\022\004\022\0020\006\022\004\022\0020\0070\005¢\006\002\b\bX\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\nR\032\020\016\032\0020\017X\016¢\006\016\n\000\032\004\b\020\020\021\"\004\b\022\020\023R\024\020\027\032\0020\030X\004¢\006\b\n\000\032\004\b\031\020\032¨\006\034"}, d2 = {"Lorg/jetbrains/jewel/foundation/actionSystem/DataProviderNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "dataProvider", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/foundation/actionSystem/DataProviderContext;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getDataProvider", "()Lkotlin/jvm/functions/Function1;", "setDataProvider", "hasFocus", "", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "onFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "traverseKey", "Lorg/jetbrains/jewel/foundation/actionSystem/DataProviderNode$TraverseKey;", "getTraverseKey", "()Lorg/jetbrains/jewel/foundation/actionSystem/DataProviderNode$TraverseKey;", "TraverseKey", "foundation"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class DataProviderNode extends Modifier.Node implements FocusEventModifierNode, TraversableNode { @NotNull
/*    */   public static final TraverseKey TraverseKey = new TraverseKey(null); @NotNull
/*    */   private Function1<? super DataProviderContext, Unit> dataProvider;
/*    */   @NotNull
/*  8 */   public final Function1<DataProviderContext, Unit> getDataProvider() { return (Function1)this.dataProvider; } private boolean hasFocus; @NotNull private final TraverseKey traverseKey; public static final int $stable = 8; public final void setDataProvider(@NotNull Function1<? super DataProviderContext, Unit> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.dataProvider = <set-?>; } public DataProviderNode(@NotNull Function1<? super DataProviderContext, Unit> dataProvider) { this.dataProvider = dataProvider;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 16 */     this.traverseKey = TraverseKey; } public final boolean getHasFocus() { return this.hasFocus; } public final void setHasFocus(boolean <set-?>) { this.hasFocus = <set-?>; } public void onFocusEvent(@NotNull FocusState focusState) { Intrinsics.checkNotNullParameter(focusState, "focusState"); this.hasFocus = focusState.getHasFocus(); } @NotNull public TraverseKey getTraverseKey() { return this.traverseKey; }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/foundation/actionSystem/DataProviderNode$TraverseKey;", "", "<init>", "()V", "foundation"})
/*    */   public static final class TraverseKey {
/*    */     private TraverseKey() {}
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\actionSystem\DataProviderNode.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
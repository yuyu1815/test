/*    */ package org.jetbrains.jewel.foundation.actionSystem;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\b\001\030\0002\b\022\004\022\0020\0020\001B \022\027\020\003\032\023\022\004\022\0020\005\022\004\022\0020\0060\004¢\006\002\b\007¢\006\004\b\b\020\tJ\b\020\f\032\0020\002H\026J\020\020\r\032\0020\0062\006\020\016\032\0020\002H\026J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022H\002J\b\020\023\032\0020\024H\026R\"\020\003\032\023\022\004\022\0020\005\022\004\022\0020\0060\004¢\006\002\b\007¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lorg/jetbrains/jewel/foundation/actionSystem/DataProviderElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lorg/jetbrains/jewel/foundation/actionSystem/DataProviderNode;", "dataProvider", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/foundation/actionSystem/DataProviderContext;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getDataProvider", "()Lkotlin/jvm/functions/Function1;", "create", "update", "node", "equals", "", "other", "", "hashCode", "", "foundation"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class DataProviderElement extends ModifierNodeElement<DataProviderNode> { @NotNull
/*    */   private final Function1<DataProviderContext, Unit> dataProvider; @NotNull
/*  5 */   public final Function1<DataProviderContext, Unit> getDataProvider() { return this.dataProvider; } public static final int $stable; public DataProviderElement(@NotNull Function1<DataProviderContext, Unit> dataProvider) { this.dataProvider = dataProvider; } @NotNull
/*    */   public DataProviderNode create() {
/*  7 */     return new DataProviderNode(this.dataProvider);
/*    */   }
/*    */   public void update(@NotNull DataProviderNode node) {
/* 10 */     Intrinsics.checkNotNullParameter(node, "node"); node.setDataProvider(this.dataProvider);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/* 14 */     if (this == other) return true; 
/* 15 */     if (!Intrinsics.areEqual(getClass(), (other != null) ? other.getClass() : null)) return false;
/*    */     
/* 17 */     Intrinsics.checkNotNull(other, "null cannot be cast to non-null type org.jetbrains.jewel.foundation.actionSystem.DataProviderElement"); (DataProviderElement)other;
/*    */     
/* 19 */     return Intrinsics.areEqual(this.dataProvider, ((DataProviderElement)other).dataProvider);
/*    */   }
/*    */   public int hashCode() {
/* 22 */     return this.dataProvider.hashCode();
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\actionSystem\DataProviderElement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
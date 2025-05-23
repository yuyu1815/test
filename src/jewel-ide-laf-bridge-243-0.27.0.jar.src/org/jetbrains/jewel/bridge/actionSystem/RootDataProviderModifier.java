/*    */ package org.jetbrains.jewel.bridge.actionSystem;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import com.intellij.openapi.actionSystem.DataSink;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @InternalJewelApi
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\000\n\002\020\013\n\000\n\002\020\000\n\000\b\007\030\0002\b\022\004\022\0020\0020\0012\0020\003B\007¢\006\004\b\004\020\005J\020\020\007\032\0020\b2\006\020\t\032\0020\nH\026J\b\020\013\032\0020\002H\026J\020\020\f\032\0020\b2\006\020\r\032\0020\002H\026J\b\020\016\032\0020\017H\026J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\023H\002R\016\020\006\032\0020\002X\004¢\006\002\n\000¨\006\024"}, d2 = {"Lorg/jetbrains/jewel/bridge/actionSystem/RootDataProviderModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lorg/jetbrains/jewel/bridge/actionSystem/RootDataProviderNode;", "Lcom/intellij/openapi/actionSystem/UiDataProvider;", "<init>", "()V", "rootNode", "uiDataSnapshot", "", "sink", "Lcom/intellij/openapi/actionSystem/DataSink;", "create", "update", "node", "hashCode", "", "equals", "", "other", "", "ide-laf-bridge"})
/*    */ @VisibleForTesting
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class RootDataProviderModifier extends ModifierNodeElement<RootDataProviderNode> implements UiDataProvider {
/*    */   @NotNull
/* 12 */   private final RootDataProviderNode rootNode = new RootDataProviderNode(); public static final int $stable;
/*    */   
/*    */   public void uiDataSnapshot(@NotNull DataSink sink) {
/* 15 */     Intrinsics.checkNotNullParameter(sink, "sink"); this.rootNode.uiDataSnapshot(sink);
/*    */   } @NotNull
/*    */   public RootDataProviderNode create() {
/* 18 */     return this.rootNode;
/*    */   }
/*    */   
/*    */   public void update(@NotNull RootDataProviderNode node) {
/* 22 */     Intrinsics.checkNotNullParameter(node, "node");
/*    */   } public int hashCode() {
/* 24 */     return this.rootNode.hashCode();
/*    */   } public boolean equals(@Nullable Object other) {
/* 26 */     return (other == this);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\actionSystem\RootDataProviderModifier.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
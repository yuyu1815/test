/*    */ package org.jetbrains.jewel.bridge.actionSystem;
/*    */ 
/*    */ import androidx.compose.ui.node.TraversableNode;
/*    */ import com.intellij.openapi.actionSystem.DataSink;
/*    */ import com.intellij.openapi.actionSystem.UiDataProvider;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.VisibleForTesting;
/*    */ import org.jetbrains.jewel.foundation.actionSystem.DataProviderNode;
/*    */ 
/*    */ @InternalJewelApi
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\b\007\030\0002\0020\0012\0020\002B\007¢\006\004\b\003\020\004J\020\020\005\032\0020\0062\006\020\007\032\0020\bH\026¨\006\t"}, d2 = {"Lorg/jetbrains/jewel/bridge/actionSystem/RootDataProviderNode;", "Landroidx/compose/ui/Modifier$Node;", "Lcom/intellij/openapi/actionSystem/UiDataProvider;", "<init>", "()V", "uiDataSnapshot", "", "sink", "Lcom/intellij/openapi/actionSystem/DataSink;", "ide-laf-bridge"})
/*    */ @VisibleForTesting
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class RootDataProviderNode extends Modifier.Node implements UiDataProvider {
/* 16 */   public void uiDataSnapshot(@NotNull DataSink sink) { Intrinsics.checkNotNullParameter(sink, "sink"); DataProviderDataSinkContext context = new DataProviderDataSinkContext(sink);
/*    */     
/* 18 */     TraversableNodeKt.traverseDescendants((DelegatableNode)this, DataProviderNode.TraverseKey, context::uiDataSnapshot$lambda$0); } public static final int $stable; private static final TraversableNode.Companion.TraverseDescendantsAction uiDataSnapshot$lambda$0(DataProviderDataSinkContext $context, TraversableNode dp) {
/* 19 */     Intrinsics.checkNotNullParameter(dp, "dp"); if (dp instanceof DataProviderNode) {
/* 20 */       if (!((DataProviderNode)dp).getHasFocus()) {
/* 21 */         return 
/* 22 */           TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
/*    */       }
/* 24 */       ((DataProviderNode)dp).getDataProvider().invoke($context);
/*    */     } 
/*    */     
/* 27 */     return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\actionSystem\RootDataProviderNode.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
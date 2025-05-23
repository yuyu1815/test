/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.ui.DialogWrapper;
/*    */ import com.intellij.openapi.ui.DialogWrapperPeer;
/*    */ import com.intellij.openapi.ui.impl.DialogWrapperPeerImpl;
/*    */ import com.intellij.util.ui.JBUI;
/*    */ import java.awt.Component;
/*    */ import javax.swing.Action;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.border.Border;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.bridge.JewelComposePanelKt;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\030\002\n\002\b\002\b\"\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\004\b\006\020\007J\023\020\b\032\b\022\004\022\0020\n0\tH\024¢\006\002\020\013J\030\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\004\032\0020\005H\024J\n\020\020\032\004\030\0010\021H\024J\021\020\022\032\0020\023*\0020\024H'¢\006\002\020\025¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/AbstractComposeModalDialog;", "Lcom/intellij/openapi/ui/DialogWrapper;", "project", "Lcom/intellij/openapi/project/Project;", "canBeParent", "", "<init>", "(Lcom/intellij/openapi/project/Project;Z)V", "createActions", "", "Ljavax/swing/Action;", "()[Ljavax/swing/Action;", "createPeer", "Lcom/intellij/openapi/ui/DialogWrapperPeer;", "parent", "Ljava/awt/Component;", "createCenterPanel", "Ljavax/swing/JComponent;", "setContent", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/ComposeDialogScope;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/ComposeDialogScope;Landroidx/compose/runtime/Composer;I)V", "ej-ui"})
/*    */ abstract class AbstractComposeModalDialog
/*    */   extends DialogWrapper
/*    */ {
/*    */   public AbstractComposeModalDialog(@NotNull Project project, boolean canBeParent) {
/* 68 */     super(project, canBeParent);
/*    */ 
/*    */     
/* 71 */     init();
/* 72 */     getContentPanel().setBorder((Border)JBUI.Borders.empty());
/* 73 */     getRootPane().setBorder((Border)JBUI.Borders.empty());
/*    */   } @NotNull
/*    */   protected Action[] createActions() {
/* 76 */     return new Action[0];
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   protected DialogWrapperPeer createPeer(@NotNull Component parent, boolean canBeParent) {
/* 82 */     Intrinsics.checkNotNullParameter(parent, "parent"); Intrinsics.checkNotNullExpressionValue(super.createPeer(parent, canBeParent), "createPeer(...)"); DialogWrapperPeer peer = super.createPeer(parent, canBeParent);
/* 83 */     if (((peer instanceof DialogWrapperPeerImpl) ? peer : null) != null) {
/* 84 */       ((DialogWrapperPeerImpl)peer).setUndecorated(true);
/*    */     }
/* 86 */     return peer;
/*    */   }
/*    */   @Composable
/*    */   public abstract void setContent(@NotNull ComposeDialogScope paramComposeDialogScope, @Nullable Composer paramComposer, int paramInt); @Nullable
/* 90 */   protected JComponent createCenterPanel() { AbstractComposeModalDialog$createCenterPanel$scope$1 scope = new AbstractComposeModalDialog$createCenterPanel$scope$1();
/*    */ 
/*    */     
/* 93 */     return JewelComposePanelKt.JewelComposePanel$default(null, (Function2)ComposableLambdaKt.composableLambdaInstance(1499296336, true, new AbstractComposeModalDialog$createCenterPanel$1(scope)), 1, null); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/AbstractComposeModalDialog$createCenterPanel$scope$1", "Lcom/intellij/ml/llm/matterhorn/ej/ui/ComposeDialogScope;", "closeDialog", "", "ej-ui"}) public static final class AbstractComposeModalDialog$createCenterPanel$scope$1 implements ComposeDialogScope { public void closeDialog() { AbstractComposeModalDialog.this.close(0); } } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class AbstractComposeModalDialog$createCenterPanel$1 implements Function2<Composer, Integer, Unit> { @Composable public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1499296336, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.AbstractComposeModalDialog.createCenterPanel.<anonymous> (ComposeModalDialog.kt:92)");  AbstractComposeModalDialog.this.setContent(this.$scope, $composer, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */        }
/*    */ 
/*    */     
/*    */     AbstractComposeModalDialog$createCenterPanel$1(AbstractComposeModalDialog$createCenterPanel$scope$1 $scope) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\AbstractComposeModalDialog.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
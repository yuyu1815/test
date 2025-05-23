/*    */ package org.jetbrains.jewel.bridge;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.openapi.actionSystem.DataSink;
/*    */ import com.intellij.openapi.actionSystem.UiDataProvider;
/*    */ import javax.swing.JPanel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\b\n\002\020\002\n\000\n\002\030\002\n\000\b\001\030\0002\0020\0012\0020\002B\007¢\006\004\b\003\020\004J\020\020\n\032\0020\0132\006\020\f\032\0020\rH\026R\034\020\005\032\004\030\0010\002X\016¢\006\016\n\000\032\004\b\006\020\007\"\004\b\b\020\t¨\006\016"}, d2 = {"Lorg/jetbrains/jewel/bridge/JewelComposePanel;", "Ljavax/swing/JPanel;", "Lcom/intellij/openapi/actionSystem/UiDataProvider;", "<init>", "()V", "targetProvider", "getTargetProvider$ide_laf_bridge", "()Lcom/intellij/openapi/actionSystem/UiDataProvider;", "setTargetProvider$ide_laf_bridge", "(Lcom/intellij/openapi/actionSystem/UiDataProvider;)V", "uiDataSnapshot", "", "sink", "Lcom/intellij/openapi/actionSystem/DataSink;", "ide-laf-bridge"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class JewelComposePanel
/*    */   extends JPanel
/*    */   implements UiDataProvider
/*    */ {
/*    */   @Nullable
/*    */   private UiDataProvider targetProvider;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   @Nullable
/*    */   public final UiDataProvider getTargetProvider$ide_laf_bridge() {
/* 93 */     return this.targetProvider; } public final void setTargetProvider$ide_laf_bridge(@Nullable UiDataProvider <set-?>) { this.targetProvider = <set-?>; }
/*    */   
/*    */   public void uiDataSnapshot(@NotNull DataSink sink) {
/* 96 */     Intrinsics.checkNotNullParameter(sink, "sink"); if (this.targetProvider != null) { this.targetProvider.uiDataSnapshot(sink); }
/*    */     else
/*    */     {  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\JewelComposePanel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
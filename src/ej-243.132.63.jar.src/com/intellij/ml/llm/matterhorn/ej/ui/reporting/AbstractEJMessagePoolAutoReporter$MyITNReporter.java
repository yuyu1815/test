/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.reporting;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.diagnostic.ITNReporter;
/*     */ import com.intellij.ide.plugins.PluginUtil;
/*     */ import com.intellij.internal.statistic.utils.PluginInfoDetectorKt;
/*     */ import com.intellij.internal.statistic.utils.StatisticsUploadAssistant;
/*     */ import com.intellij.ml.llm.matterhorn.configuration.BuildConfigKt;
/*     */ import com.intellij.openapi.diagnostic.IdeaLoggingEvent;
/*     */ import com.intellij.openapi.extensions.PluginId;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\000\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter$MyITNReporter;", "Lcom/intellij/diagnostic/ITNReporter;", "<init>", "()V", "showErrorInRelease", "", "event", "Lcom/intellij/openapi/diagnostic/IdeaLoggingEvent;", "ej-ui"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class MyITNReporter
/*     */   extends ITNReporter
/*     */ {
/*     */   public static final int $stable;
/*     */   
/*     */   public MyITNReporter() {
/* 165 */     super(null, 1, null);
/*     */   } public boolean showErrorInRelease(@NotNull IdeaLoggingEvent event) {
/* 167 */     Intrinsics.checkNotNullParameter(event, "event"); if (BuildConfigKt.getConfig().getEapExceptionProcessing() || StatisticsUploadAssistant.isAllowedByUserConsent()) {
/* 168 */       PluginId pluginId = PluginUtil.getInstance().findPluginId(event.getThrowable()); int $i$a$-let-AbstractEJMessagePoolAutoReporter$MyITNReporter$showErrorInRelease$1 = 0;
/* 169 */       if ((pluginId != null && Intrinsics.areEqual(pluginId.getIdString(), "org.jetbrains.junie") && PluginInfoDetectorKt.getPluginInfoById(pluginId).isSafeToReport()));
/*     */     } 
/*     */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\reporting\AbstractEJMessagePoolAutoReporter$MyITNReporter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
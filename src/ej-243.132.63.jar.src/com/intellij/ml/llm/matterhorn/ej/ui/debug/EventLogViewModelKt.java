/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.debug;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\016\020\000\032\0020\0012\006\020\002\032\0020\003¨\006\004"}, d2 = {"getEventCategory", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventCategory;", "event", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "ej-ui"})
/*     */ public final class EventLogViewModelKt
/*     */ {
/*     */   @NotNull
/*     */   public static final EventCategory getEventCategory(@NotNull CustomArtifactEvent event) {
/*  94 */     Intrinsics.checkNotNullParameter(event, "event"); CustomArtifactEvent customArtifactEvent = event; return 
/*  95 */       (customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.llm.LlmRequestEvent || 
/*  96 */       customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.llm.LlmResponseEvent || 
/*  97 */       customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.llm.LlmRequestFailed) ? EventCategory.LLM : (
/*     */       
/*  99 */       (customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.BeforeArtifactBuildingStarted || 
/* 100 */       customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.AfterArtifactBuildingFinished) ? 
/* 101 */       EventCategory.ARTIFACT : (
/*     */       
/* 103 */       (customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.ej.core.BeforeStepStartedEvent || 
/* 104 */       customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.ej.core.AfterStepFinishedEvent || 
/* 105 */       customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.ej.core.ActionRequestBuildingStarted || 
/* 106 */       customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.ej.core.ActionRequestBuildingFinished || 
/* 107 */       customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.ej.core.ActionRequestBuildingFailed) ? EventCategory.STEP : 
/*     */       
/* 109 */       EventCategory.OTHER));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\debug\EventLogViewModelKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*    */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*    */ import com.intellij.util.ApplicationKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\036\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007¨\006\b"}, d2 = {"emitMetadata", "", "name", "", "stepType", "Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "ej-core"})
/*    */ public final class StepMetadataKt
/*    */ {
/*    */   public static final void emitMetadata(@NotNull String name, @NotNull StepType stepType, @NotNull ExecutionAgentContext context) {
/* 14 */     Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(stepType, "stepType"); Intrinsics.checkNotNullParameter(context, "context"); if (ApplicationKt.getApplication().isUnitTestMode())
/* 15 */       return;  ExecutionContext executionContext = context.getExecutionContext();
/* 16 */     executionContext.sendEvent((CustomArtifactEvent)new StepMetaInfoAppearedEvent(name, stepType));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\StepMetadataKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
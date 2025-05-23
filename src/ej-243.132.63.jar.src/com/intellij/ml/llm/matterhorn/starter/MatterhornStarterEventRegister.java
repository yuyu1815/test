/*     */ package com.intellij.ml.llm.matterhorn.starter;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.BeforeArtifactBuildingStarted;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ActionRequestBuildingFailed;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ActionRequestBuildingFinished;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AfterStepFinishedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentActionExecutionFinished;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentActionExecutionStarted;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentStateUpdatedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.SemanticCheckStarted;
/*     */ import com.intellij.ml.llm.matterhorn.events.ClassWithSerializer;
/*     */ import com.intellij.ml.llm.matterhorn.events.SerializableEventRegisterImplBuilder;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LlmRequestFailed;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LongDelayDetected;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/starter/MatterhornStarterEventRegister;", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEventRegisterImpl;", "<init>", "()V", "matterhorn"})
/*     */ @SourceDebugExtension({"SMAP\nEventRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventRegistry.kt\ncom/intellij/ml/llm/matterhorn/starter/MatterhornStarterEventRegister\n+ 2 SerializableEventRegisterImpl.kt\ncom/intellij/ml/llm/matterhorn/events/SerializableEventRegisterImplBuilder\n*L\n1#1,63:1\n40#2,2:64\n40#2,2:66\n40#2,2:68\n40#2,2:70\n40#2,2:72\n40#2,2:74\n40#2,2:76\n40#2,2:78\n40#2,2:80\n40#2,2:82\n40#2,2:84\n40#2,2:86\n40#2,2:88\n40#2,2:90\n40#2,2:92\n40#2,2:94\n40#2,2:96\n40#2,2:98\n40#2,2:100\n40#2,2:102\n40#2,2:104\n40#2,2:106\n40#2,2:108\n40#2,2:110\n40#2,2:112\n40#2,2:114\n*S KotlinDebug\n*F\n+ 1 EventRegistry.kt\ncom/intellij/ml/llm/matterhorn/starter/MatterhornStarterEventRegister\n*L\n21#1:64,2\n23#1:66,2\n25#1:68,2\n27#1:70,2\n29#1:72,2\n30#1:74,2\n32#1:76,2\n33#1:78,2\n34#1:80,2\n36#1:82,2\n38#1:84,2\n39#1:86,2\n41#1:88,2\n42#1:90,2\n43#1:92,2\n45#1:94,2\n46#1:96,2\n47#1:98,2\n49#1:100,2\n51#1:102,2\n53#1:104,2\n55#1:106,2\n57#1:108,2\n58#1:110,2\n60#1:112,2\n61#1:114,2\n*E\n"})
/*     */ final class MatterhornStarterEventRegister extends SerializableEventRegisterImpl {
/*  20 */   public MatterhornStarterEventRegister() { super(MatterhornStarterEventRegister::_init_$lambda$0); } private static final Unit _init_$lambda$0(SerializableEventRegisterImplBuilder <this>) {
/*  21 */     Intrinsics.checkNotNullParameter(<this>, "<this>"); SerializableEventRegisterImplBuilder this_$iv = <this>; int $i$f$register = 0;
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
/*  64 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(SerializableEventSerializationError.class), SerializableEventSerializationError.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/*  66 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(AgentSessionUpdatedEvent.class), AgentSessionUpdatedEvent.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/*  68 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(PlanUpdatedEvent.class), PlanUpdatedEvent.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/*  70 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(AgentStateUpdatedEvent.class), AgentStateUpdatedEvent.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/*  72 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(BeforeArtifactBuildingStarted.class), BeforeArtifactBuildingStarted.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/*  74 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(AfterArtifactBuildingFinished.class), AfterArtifactBuildingFinished.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/*  76 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(LlmRequestEvent.class), LlmRequestEvent.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/*  78 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(LlmResponseEvent.class), LlmResponseEvent.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/*  80 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(LlmRequestFailed.class), LlmRequestFailed.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/*  82 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(LongDelayDetected.class), LongDelayDetected.INSTANCE.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/*  84 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(BeforeStepStartedEvent.class), BeforeStepStartedEvent.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/*  86 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(AfterStepFinishedEvent.class), AfterStepFinishedEvent.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/*  88 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(ActionRequestBuildingStarted.class), ActionRequestBuildingStarted.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/*  90 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(ActionRequestBuildingFailed.class), ActionRequestBuildingFailed.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/*  92 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(ActionRequestBuildingFinished.class), ActionRequestBuildingFinished.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/*  94 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(AgentActionExecutionStarted.class), AgentActionExecutionStarted.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/*  96 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(AgentActionExecutionFailed.class), AgentActionExecutionFailed.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/*  98 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(AgentActionExecutionFinished.class), AgentActionExecutionFinished.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/* 100 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(TaskResultCreatedEvent.class), TaskResultCreatedEvent.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/* 102 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(StepMetaInfoAppearedEvent.class), StepMetaInfoAppearedEvent.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/* 104 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(TaskSummaryCreatedEvent.class), TaskSummaryCreatedEvent.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/* 106 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(EditEvent.class), EditEvent.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/* 108 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(SemanticCheckStarted.class), SemanticCheckStarted.INSTANCE.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/* 110 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(SemanticCheckFinished.class), SemanticCheckFinished.INSTANCE.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/* 112 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(ErrorCheckerStarted.class), ErrorCheckerStarted.Companion.serializer())); this_$iv = <this>;
/*     */     $i$f$register = 0;
/* 114 */     this_$iv.getList().add(new ClassWithSerializer(Reflection.getOrCreateKotlinClass(ErrorCheckerFinished.class), ErrorCheckerFinished.Companion.serializer()));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\MatterhornStarterEventRegister.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
/*     */ package com.intellij.ml.llm.matterhorn.ej.core.edit_workers;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactId;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactType;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.TrajectoryElementAgent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.Argument;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.critique.CritiqueResponse;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessageKind;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000j\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\006\b&\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\017\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\026\020\f\032\0020\r2\006\020\016\032\0020\017H¦@¢\006\002\020\020J\026\020\021\032\0020\0222\006\020\016\032\0020\017H@¢\006\002\020\020J$\020\023\032\b\022\004\022\0020\0030\0242\006\020\025\032\0020\0022\006\020\026\032\0020\027H@¢\006\002\020\030J\020\020\031\032\0020\0052\006\020\026\032\0020\032H\004J*\020\033\032\f\022\006\b\001\022\0020\035\030\0010\0342\006\020\026\032\0020\0272\006\020\036\032\0020\0222\006\020\037\032\0020 H\002JB\020!\032\b\022\004\022\0020#0\"2\f\020$\032\b\022\004\022\0020#0\"2\006\020%\032\0020\0022\006\020\026\032\0020\0322\006\020\037\032\0020 2\006\020\036\032\0020\022H@¢\006\002\020&J\026\020'\032\b\022\004\022\0020(0\"2\006\020\026\032\0020\032H&J:\020)\032\b\022\004\022\0020#0\"2\006\020\026\032\0020\0322\006\020\037\032\0020 2\006\020%\032\0020\0022\f\020*\032\b\022\004\022\0020#0\"H¦@¢\006\002\020+J\020\020,\032\0020\0052\006\020\026\032\0020\032H&J\020\020-\032\0020\0052\006\020\026\032\0020\032H&R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\b\020\tR\022\020\n\032\0020\005X¦\004¢\006\006\032\004\b\013\020\t¨\006."}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker;", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentResponse;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "critiqueArtifactNameSuffix", "getCritiqueArtifactNameSuffix", "getTrajectoryElementAgent", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "(Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAgentParameters", "Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "input", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCommandDescription", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "getCritiqueArtifactId", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse;", "agentParameters", "attempt", "", "checkAndSortActions", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "actions", "currentState", "(Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ILcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAvailableActions", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "runCritic", "optionsToRank", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ILcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSystemMessage", "getDemonstration", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAbstractEditWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractEditWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArtifactRequestExecutorService.kt\ncom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorServiceKt\n*L\n1#1,264:1\n1734#2,3:265\n774#2:268\n865#2,2:269\n1863#2,2:271\n1557#2:273\n1628#2,3:274\n1557#2:278\n1628#2,3:279\n1557#2:282\n1628#2,3:283\n1734#2,3:286\n774#2:289\n865#2,2:290\n1557#2:292\n1628#2,3:293\n2318#2,14:297\n1#3:277\n117#4:296\n*S KotlinDebug\n*F\n+ 1 AbstractEditWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker\n*L\n119#1:265,3\n120#1:268\n120#1:269,2\n129#1:271,2\n166#1:273\n166#1:274,3\n184#1:278\n184#1:279,3\n227#1:282\n227#1:283,3\n232#1:286,3\n237#1:289\n237#1:290,2\n237#1:292\n237#1:293,3\n248#1:297,14\n240#1:296\n*E\n"})
/*     */ public abstract class AbstractEditWorker
/*     */   implements ArtifactRequestExecutor<AgentState, EditAgentResponse>
/*     */ {
/*     */   @NotNull
/*     */   private final String title;
/*     */   
/*     */   public AbstractEditWorker(@NotNull String title) {
/*  89 */     this.title = title; } @NotNull public final String getTitle() { return this.title; }
/*     */   
/*     */   @DebugMetadata(f = "AbstractEditWorker.kt", l = {229, 241}, i = {0, 0, 0, 0, 0, 0, 0, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0"}, n = {"this", "actions", "currentState", "context", "agentParameters", "destination$iv$iv", "attempt", "actionsFiltered"}, m = "checkAndSortActions", c = "com.intellij.ml.llm.matterhorn.ej.core.edit_workers.AbstractEditWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractEditWorker$checkAndSortActions$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     Object L$7;
/*     */     int I$0;
/*     */     int label;
/*     */     
/*     */     AbstractEditWorker$checkAndSortActions$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractEditWorker.this.checkAndSortActions(null, null, null, 0, null, (Continuation<? super List<? extends MatterhornChatElement>>)this);
/*     */     } }
/*     */   
/*     */   @DebugMetadata(f = "AbstractEditWorker.kt", l = {95, 96}, i = {0}, s = {"L$0"}, n = {"propertyProvider"}, m = "getAgentParameters$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.edit_workers.AbstractEditWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractEditWorker$getAgentParameters$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     AbstractEditWorker$getAgentParameters$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractEditWorker.getAgentParameters$suspendImpl(AbstractEditWorker.this, null, (Continuation<? super EditAgentParameters>)this);
/*     */     } }
/*     */   
/*     */   @DebugMetadata(f = "AbstractEditWorker.kt", l = {103, 104, 125, 126, 127, 131, 132, 173, 177, 178, 193, 196}, i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0"}, n = {"$this", "input", "context", "executionAgentContext", "propertyProvider", "$this", "input", "context", "executionAgentContext", "agentParameters", "$this", "input", "context", "executionAgentContext", "agentParameters", "trajectoryElementAgent", "systemMessage", "issueDescriptionMessage", "demo", "userMessages", "$this", "input", "context", "executionAgentContext", "agentParameters", "trajectoryElementAgent", "systemMessage", "issueDescriptionMessage", "demo", "userMessages", "$this", "input", "context", "executionAgentContext", "agentParameters", "trajectoryElementAgent", "systemMessage", "issueDescriptionMessage", "demo", "userMessages", "$this", "input", "context", "executionAgentContext", "agentParameters", "trajectoryElementAgent", "systemMessage", "issueDescriptionMessage", "demo", "userMessages", "$this", "input", "context", "executionAgentContext", "agentParameters", "trajectoryElementAgent", "systemMessage", "issueDescriptionMessage", "demo", "userMessages", "$this", "input", "context", "executionAgentContext", "agentParameters", "trajectoryElementAgent", "systemMessage", "issueDescriptionMessage", "demo", "userMessages", "additionalMessages", "attempt", "context", "trajectoryElementAgent", "actionString", "actionRequest", "actionRequest", "$this", "input", "context", "executionAgentContext", "agentParameters", "trajectoryElementAgent", "systemMessage", "issueDescriptionMessage", "demo", "userMessages", "additionalMessages", "actionString", "attempt", "$this", "input", "context", "executionAgentContext", "agentParameters", "trajectoryElementAgent", "systemMessage", "issueDescriptionMessage", "demo", "userMessages", "additionalMessages", "attempt"}, m = "produceArtifact$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.edit_workers.AbstractEditWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractEditWorker$produceArtifact$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     Object L$7;
/*     */     Object L$8;
/*     */     Object L$9;
/*     */     Object L$10;
/*     */     Object L$11;
/*     */     int I$0;
/*     */     int I$1;
/*     */     int label;
/*     */     
/*     */     AbstractEditWorker$produceArtifact$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractEditWorker.produceArtifact$suspendImpl(AbstractEditWorker.this, null, null, (Continuation<? super ArtifactResponse<EditAgentResponse>>)this);
/*     */     } }
/*     */   
/*     */   @DebugMetadata(f = "AbstractEditWorker.kt", l = {170}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.edit_workers.AbstractEditWorker$produceArtifact$request$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\0042\f\020\005\032\b\022\004\022\0020\0020\001H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "executionContext", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "optionsToRank"})
/*     */   static final class AbstractEditWorker$produceArtifact$request$2 extends SuspendLambda implements Function3<ExecutionContext, List<? extends MatterhornChatElement>, Continuation<? super List<? extends MatterhornChatElement>>, Object> { int label;
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       List<? extends MatterhornChatElement> optionsToRank;
/* 169 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); optionsToRank = (List)this.L$0;
/* 170 */           this.label = 1; if (AbstractEditWorker.this.runCritic(this.$executionAgentContext, this.$attempt, this.$currentState, optionsToRank, (Continuation<? super List<? extends MatterhornChatElement>>)this) == object) return object;  return AbstractEditWorker.this.runCritic(this.$executionAgentContext, this.$attempt, this.$currentState, optionsToRank, (Continuation<? super List<? extends MatterhornChatElement>>)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AbstractEditWorker$produceArtifact$request$2(ExecutionAgentContext $executionAgentContext, int $attempt, AgentState $currentState, Continuation $completion) {
/*     */       super(3, $completion);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Object invoke(ExecutionContext p1, List p2, Continuation<? super AbstractEditWorker$produceArtifact$request$2> p3) {
/*     */       AbstractEditWorker$produceArtifact$request$2 abstractEditWorker$produceArtifact$request$2 = new AbstractEditWorker$produceArtifact$request$2(this.$executionAgentContext, this.$attempt, this.$currentState, p3);
/*     */       abstractEditWorker$produceArtifact$request$2.L$0 = p2;
/*     */       return abstractEditWorker$produceArtifact$request$2.invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   protected final String getCommandDescription(@NotNull ExecutionAgentContext context) {
/* 203 */     Intrinsics.checkNotNullParameter(context, "context"); return CollectionsKt.joinToString$default(getAvailableActions(context), "\n", null, null, 0, null, AbstractEditWorker::getCommandDescription$lambda$9, 30, null);
/* 204 */   } private static final CharSequence getCommandDescription$lambda$9$lambda$7$lambda$6(Argument it) { Intrinsics.checkNotNullParameter(it, "it"); return it.short(); } private static final CharSequence getCommandDescription$lambda$9(AgentAction action) { Intrinsics.checkNotNullParameter(action, "action"); CharSequence charSequence = action.getCustomSignature();
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
/* 277 */     int $i$a$-ifEmpty-AbstractEditWorker$getCommandDescription$1$signature$1 = 0;
/*     */     String signature = ((charSequence.length() == 0)) ? (action.getName() + " " + action.getName()) : (String)charSequence;
/*     */     return "<action_description>\n" + action.getName() + ":\n  signature: " + signature + "\n" + (action.getArguments().isEmpty() ? "" : ("  arguments:\n" + CollectionsKt.joinToString$default(action.getArguments(), "\n", null, null, 0, null, AbstractEditWorker::getCommandDescription$lambda$9$lambda$8, 30, null))) + "\n  docstring: " + StringsKt.trim(action.getDocstring()).toString() + "\n</action_description>\n"; }
/*     */ 
/*     */   
/*     */   private static final CharSequence getCommandDescription$lambda$9$lambda$8(Argument it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return "    - " + it.full();
/*     */   }
/*     */   
/*     */   private final ArtifactId<? extends CritiqueResponse> getCritiqueArtifactId(ExecutionContext context, EditAgentParameters agentParameters, int attempt) {
/*     */     ArtifactType critiqueArtifactType;
/*     */     if (agentParameters.getCritique() == null || agentParameters.getCritique().getCritiqueArtifactType() == null) {
/*     */       agentParameters.getCritique().getCritiqueArtifactType();
/*     */       return null;
/*     */     } 
/*     */     return context.getArtifact().childOfType(context.getArtifact().getName() + context.getArtifact().getName() + "_" + getCritiqueArtifactNameSuffix(), critiqueArtifactType);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected final Object checkAndSortActions(@NotNull List actions, @NotNull AgentState currentState, @NotNull ExecutionAgentContext context, int attempt, @NotNull EditAgentParameters agentParameters, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker$checkAndSortActions$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #6
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker$checkAndSortActions$1
/*     */     //   13: astore #23
/*     */     //   15: aload #23
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #23
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker$checkAndSortActions$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #6
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #23
/*     */     //   53: aload #23
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #22
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #24
/*     */     //   65: aload #23
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 1210, 0 -> 96, 1 -> 287, 2 -> 913
/*     */     //   96: aload #22
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_1
/*     */     //   102: checkcast java/lang/Iterable
/*     */     //   105: astore #8
/*     */     //   107: iconst_0
/*     */     //   108: istore #9
/*     */     //   110: aload #8
/*     */     //   112: astore #10
/*     */     //   114: new java/util/ArrayList
/*     */     //   117: dup
/*     */     //   118: aload #8
/*     */     //   120: bipush #10
/*     */     //   122: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   125: invokespecial <init> : (I)V
/*     */     //   128: checkcast java/util/Collection
/*     */     //   131: astore #11
/*     */     //   133: iconst_0
/*     */     //   134: istore #12
/*     */     //   136: aload #10
/*     */     //   138: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   143: astore #13
/*     */     //   145: aload #13
/*     */     //   147: invokeinterface hasNext : ()Z
/*     */     //   152: ifeq -> 401
/*     */     //   155: aload #13
/*     */     //   157: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   162: astore #14
/*     */     //   164: aload #11
/*     */     //   166: aload #14
/*     */     //   168: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   171: astore #15
/*     */     //   173: astore #21
/*     */     //   175: iconst_0
/*     */     //   176: istore #16
/*     */     //   178: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest$Companion;
/*     */     //   181: aload #15
/*     */     //   183: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   188: invokevirtual parse : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;
/*     */     //   191: astore #17
/*     */     //   193: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentAction.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion;
/*     */     //   196: aload #17
/*     */     //   198: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   201: aload_3
/*     */     //   202: aload_0
/*     */     //   203: aload_3
/*     */     //   204: invokevirtual getAvailableActions : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)Ljava/util/List;
/*     */     //   207: iconst_1
/*     */     //   208: aload #23
/*     */     //   210: aload #23
/*     */     //   212: aload_0
/*     */     //   213: putfield L$0 : Ljava/lang/Object;
/*     */     //   216: aload #23
/*     */     //   218: aload_1
/*     */     //   219: putfield L$1 : Ljava/lang/Object;
/*     */     //   222: aload #23
/*     */     //   224: aload_2
/*     */     //   225: putfield L$2 : Ljava/lang/Object;
/*     */     //   228: aload #23
/*     */     //   230: aload_3
/*     */     //   231: putfield L$3 : Ljava/lang/Object;
/*     */     //   234: aload #23
/*     */     //   236: aload #5
/*     */     //   238: putfield L$4 : Ljava/lang/Object;
/*     */     //   241: aload #23
/*     */     //   243: aload #11
/*     */     //   245: putfield L$5 : Ljava/lang/Object;
/*     */     //   248: aload #23
/*     */     //   250: aload #13
/*     */     //   252: putfield L$6 : Ljava/lang/Object;
/*     */     //   255: aload #23
/*     */     //   257: aload #21
/*     */     //   259: putfield L$7 : Ljava/lang/Object;
/*     */     //   262: aload #23
/*     */     //   264: iload #4
/*     */     //   266: putfield I$0 : I
/*     */     //   269: aload #23
/*     */     //   271: iconst_1
/*     */     //   272: putfield label : I
/*     */     //   275: invokevirtual reviewActionRequest : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   278: dup
/*     */     //   279: aload #24
/*     */     //   281: if_acmpne -> 386
/*     */     //   284: aload #24
/*     */     //   286: areturn
/*     */     //   287: iconst_0
/*     */     //   288: istore #9
/*     */     //   290: iconst_0
/*     */     //   291: istore #12
/*     */     //   293: iconst_0
/*     */     //   294: istore #16
/*     */     //   296: aload #23
/*     */     //   298: getfield I$0 : I
/*     */     //   301: istore #4
/*     */     //   303: aload #23
/*     */     //   305: getfield L$7 : Ljava/lang/Object;
/*     */     //   308: checkcast java/util/Collection
/*     */     //   311: astore #21
/*     */     //   313: aload #23
/*     */     //   315: getfield L$6 : Ljava/lang/Object;
/*     */     //   318: checkcast java/util/Iterator
/*     */     //   321: astore #13
/*     */     //   323: aload #23
/*     */     //   325: getfield L$5 : Ljava/lang/Object;
/*     */     //   328: checkcast java/util/Collection
/*     */     //   331: astore #11
/*     */     //   333: aload #23
/*     */     //   335: getfield L$4 : Ljava/lang/Object;
/*     */     //   338: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters
/*     */     //   341: astore #5
/*     */     //   343: aload #23
/*     */     //   345: getfield L$3 : Ljava/lang/Object;
/*     */     //   348: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   351: astore_3
/*     */     //   352: aload #23
/*     */     //   354: getfield L$2 : Ljava/lang/Object;
/*     */     //   357: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   360: astore_2
/*     */     //   361: aload #23
/*     */     //   363: getfield L$1 : Ljava/lang/Object;
/*     */     //   366: checkcast java/util/List
/*     */     //   369: astore_1
/*     */     //   370: aload #23
/*     */     //   372: getfield L$0 : Ljava/lang/Object;
/*     */     //   375: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker
/*     */     //   378: astore_0
/*     */     //   379: aload #22
/*     */     //   381: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   384: aload #22
/*     */     //   386: checkcast java/lang/String
/*     */     //   389: aload #21
/*     */     //   391: swap
/*     */     //   392: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   397: pop
/*     */     //   398: goto -> 145
/*     */     //   401: aload #11
/*     */     //   403: checkcast java/util/List
/*     */     //   406: nop
/*     */     //   407: astore #7
/*     */     //   409: aload #7
/*     */     //   411: checkcast java/lang/Iterable
/*     */     //   414: astore #8
/*     */     //   416: iconst_0
/*     */     //   417: istore #9
/*     */     //   419: aload #8
/*     */     //   421: instanceof java/util/Collection
/*     */     //   424: ifeq -> 444
/*     */     //   427: aload #8
/*     */     //   429: checkcast java/util/Collection
/*     */     //   432: invokeinterface isEmpty : ()Z
/*     */     //   437: ifeq -> 444
/*     */     //   440: iconst_1
/*     */     //   441: goto -> 500
/*     */     //   444: aload #8
/*     */     //   446: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   451: astore #10
/*     */     //   453: aload #10
/*     */     //   455: invokeinterface hasNext : ()Z
/*     */     //   460: ifeq -> 499
/*     */     //   463: aload #10
/*     */     //   465: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   470: astore #11
/*     */     //   472: aload #11
/*     */     //   474: checkcast java/lang/String
/*     */     //   477: astore #12
/*     */     //   479: iconst_0
/*     */     //   480: istore #13
/*     */     //   482: aload #12
/*     */     //   484: ifnull -> 491
/*     */     //   487: iconst_1
/*     */     //   488: goto -> 492
/*     */     //   491: iconst_0
/*     */     //   492: ifne -> 453
/*     */     //   495: iconst_0
/*     */     //   496: goto -> 500
/*     */     //   499: iconst_1
/*     */     //   500: ifeq -> 560
/*     */     //   503: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   506: dup
/*     */     //   507: aload #7
/*     */     //   509: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   512: dup
/*     */     //   513: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   516: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   521: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   524: aconst_null
/*     */     //   525: aconst_null
/*     */     //   526: bipush #12
/*     */     //   528: aconst_null
/*     */     //   529: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   532: astore #8
/*     */     //   534: iconst_2
/*     */     //   535: anewarray com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   538: astore #9
/*     */     //   540: aload #9
/*     */     //   542: iconst_0
/*     */     //   543: aload_1
/*     */     //   544: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   547: aastore
/*     */     //   548: aload #9
/*     */     //   550: iconst_1
/*     */     //   551: aload #8
/*     */     //   553: aastore
/*     */     //   554: aload #9
/*     */     //   556: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   559: areturn
/*     */     //   560: aload_1
/*     */     //   561: checkcast java/lang/Iterable
/*     */     //   564: aload #7
/*     */     //   566: checkcast java/lang/Iterable
/*     */     //   569: invokestatic zip : (Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   572: checkcast java/lang/Iterable
/*     */     //   575: astore #9
/*     */     //   577: iconst_0
/*     */     //   578: istore #10
/*     */     //   580: aload #9
/*     */     //   582: astore #11
/*     */     //   584: new java/util/ArrayList
/*     */     //   587: dup
/*     */     //   588: invokespecial <init> : ()V
/*     */     //   591: checkcast java/util/Collection
/*     */     //   594: astore #12
/*     */     //   596: iconst_0
/*     */     //   597: istore #13
/*     */     //   599: aload #11
/*     */     //   601: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   606: astore #14
/*     */     //   608: aload #14
/*     */     //   610: invokeinterface hasNext : ()Z
/*     */     //   615: ifeq -> 666
/*     */     //   618: aload #14
/*     */     //   620: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   625: astore #15
/*     */     //   627: aload #15
/*     */     //   629: checkcast kotlin/Pair
/*     */     //   632: astore #16
/*     */     //   634: iconst_0
/*     */     //   635: istore #17
/*     */     //   637: aload #16
/*     */     //   639: invokevirtual getSecond : ()Ljava/lang/Object;
/*     */     //   642: ifnonnull -> 649
/*     */     //   645: iconst_1
/*     */     //   646: goto -> 650
/*     */     //   649: iconst_0
/*     */     //   650: ifeq -> 608
/*     */     //   653: aload #12
/*     */     //   655: aload #15
/*     */     //   657: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   662: pop
/*     */     //   663: goto -> 608
/*     */     //   666: aload #12
/*     */     //   668: checkcast java/util/List
/*     */     //   671: nop
/*     */     //   672: checkcast java/lang/Iterable
/*     */     //   675: astore #9
/*     */     //   677: iconst_0
/*     */     //   678: istore #10
/*     */     //   680: aload #9
/*     */     //   682: astore #11
/*     */     //   684: new java/util/ArrayList
/*     */     //   687: dup
/*     */     //   688: aload #9
/*     */     //   690: bipush #10
/*     */     //   692: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   695: invokespecial <init> : (I)V
/*     */     //   698: checkcast java/util/Collection
/*     */     //   701: astore #12
/*     */     //   703: iconst_0
/*     */     //   704: istore #13
/*     */     //   706: aload #11
/*     */     //   708: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   713: astore #14
/*     */     //   715: aload #14
/*     */     //   717: invokeinterface hasNext : ()Z
/*     */     //   722: ifeq -> 768
/*     */     //   725: aload #14
/*     */     //   727: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   732: astore #15
/*     */     //   734: aload #12
/*     */     //   736: aload #15
/*     */     //   738: checkcast kotlin/Pair
/*     */     //   741: astore #16
/*     */     //   743: astore #21
/*     */     //   745: iconst_0
/*     */     //   746: istore #17
/*     */     //   748: aload #16
/*     */     //   750: invokevirtual getFirst : ()Ljava/lang/Object;
/*     */     //   753: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   756: aload #21
/*     */     //   758: swap
/*     */     //   759: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   764: pop
/*     */     //   765: goto -> 715
/*     */     //   768: aload #12
/*     */     //   770: checkcast java/util/List
/*     */     //   773: nop
/*     */     //   774: astore #8
/*     */     //   776: aload_0
/*     */     //   777: aload_3
/*     */     //   778: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   783: aload #5
/*     */     //   785: iload #4
/*     */     //   787: invokespecial getCritiqueArtifactId : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;I)Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   790: dup
/*     */     //   791: ifnull -> 947
/*     */     //   794: astore #13
/*     */     //   796: iconst_0
/*     */     //   797: istore #14
/*     */     //   799: new com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput
/*     */     //   802: dup
/*     */     //   803: aload_2
/*     */     //   804: aload #8
/*     */     //   806: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Ljava/util/List;)V
/*     */     //   809: astore #15
/*     */     //   811: iconst_0
/*     */     //   812: istore #16
/*     */     //   814: new com/intellij/ml/llm/matterhorn/ArtifactRequest
/*     */     //   817: dup
/*     */     //   818: aload #13
/*     */     //   820: aload #15
/*     */     //   822: getstatic com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput$Companion;
/*     */     //   825: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   828: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;)V
/*     */     //   831: astore #17
/*     */     //   833: aload_3
/*     */     //   834: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   839: aload #17
/*     */     //   841: aconst_null
/*     */     //   842: aload #23
/*     */     //   844: iconst_2
/*     */     //   845: aconst_null
/*     */     //   846: aload #23
/*     */     //   848: aload #8
/*     */     //   850: putfield L$0 : Ljava/lang/Object;
/*     */     //   853: aload #23
/*     */     //   855: aconst_null
/*     */     //   856: putfield L$1 : Ljava/lang/Object;
/*     */     //   859: aload #23
/*     */     //   861: aconst_null
/*     */     //   862: putfield L$2 : Ljava/lang/Object;
/*     */     //   865: aload #23
/*     */     //   867: aconst_null
/*     */     //   868: putfield L$3 : Ljava/lang/Object;
/*     */     //   871: aload #23
/*     */     //   873: aconst_null
/*     */     //   874: putfield L$4 : Ljava/lang/Object;
/*     */     //   877: aload #23
/*     */     //   879: aconst_null
/*     */     //   880: putfield L$5 : Ljava/lang/Object;
/*     */     //   883: aload #23
/*     */     //   885: aconst_null
/*     */     //   886: putfield L$6 : Ljava/lang/Object;
/*     */     //   889: aload #23
/*     */     //   891: aconst_null
/*     */     //   892: putfield L$7 : Ljava/lang/Object;
/*     */     //   895: aload #23
/*     */     //   897: iconst_2
/*     */     //   898: putfield label : I
/*     */     //   901: invokestatic getOrCreateArtifact$default : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   904: dup
/*     */     //   905: aload #24
/*     */     //   907: if_acmpne -> 933
/*     */     //   910: aload #24
/*     */     //   912: areturn
/*     */     //   913: iconst_0
/*     */     //   914: istore #14
/*     */     //   916: aload #23
/*     */     //   918: getfield L$0 : Ljava/lang/Object;
/*     */     //   921: checkcast java/util/List
/*     */     //   924: astore #8
/*     */     //   926: aload #22
/*     */     //   928: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   931: aload #22
/*     */     //   933: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   936: invokevirtual getContent : ()Ljava/lang/Object;
/*     */     //   939: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse
/*     */     //   942: nop
/*     */     //   943: dup
/*     */     //   944: ifnonnull -> 971
/*     */     //   947: pop
/*     */     //   948: new com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse
/*     */     //   951: dup
/*     */     //   952: aload #8
/*     */     //   954: aload #8
/*     */     //   956: checkcast java/util/Collection
/*     */     //   959: invokestatic getIndices : (Ljava/util/Collection;)Lkotlin/ranges/IntRange;
/*     */     //   962: checkcast java/lang/Iterable
/*     */     //   965: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   968: invokespecial <init> : (Ljava/util/List;Ljava/util/List;)V
/*     */     //   971: astore #9
/*     */     //   973: aload #9
/*     */     //   975: invokevirtual getCritiqueRanks : ()Ljava/util/List;
/*     */     //   978: astore #10
/*     */     //   980: aload #9
/*     */     //   982: invokevirtual getCritiqueCandidates : ()Ljava/util/List;
/*     */     //   985: astore #11
/*     */     //   987: aload #11
/*     */     //   989: invokeinterface size : ()I
/*     */     //   994: aload #10
/*     */     //   996: invokeinterface size : ()I
/*     */     //   1001: if_icmpne -> 1008
/*     */     //   1004: iconst_1
/*     */     //   1005: goto -> 1009
/*     */     //   1008: iconst_0
/*     */     //   1009: istore #12
/*     */     //   1011: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   1014: ifeq -> 1036
/*     */     //   1017: iload #12
/*     */     //   1019: ifne -> 1036
/*     */     //   1022: ldc 'Assertion failed'
/*     */     //   1024: astore #13
/*     */     //   1026: new java/lang/AssertionError
/*     */     //   1029: dup
/*     */     //   1030: aload #13
/*     */     //   1032: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   1035: athrow
/*     */     //   1036: aload #11
/*     */     //   1038: checkcast java/lang/Iterable
/*     */     //   1041: aload #10
/*     */     //   1043: checkcast java/lang/Iterable
/*     */     //   1046: invokestatic zip : (Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   1049: checkcast java/lang/Iterable
/*     */     //   1052: astore #13
/*     */     //   1054: iconst_0
/*     */     //   1055: istore #14
/*     */     //   1057: aload #13
/*     */     //   1059: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1064: astore #15
/*     */     //   1066: aload #15
/*     */     //   1068: invokeinterface hasNext : ()Z
/*     */     //   1073: ifne -> 1084
/*     */     //   1076: new java/util/NoSuchElementException
/*     */     //   1079: dup
/*     */     //   1080: invokespecial <init> : ()V
/*     */     //   1083: athrow
/*     */     //   1084: aload #15
/*     */     //   1086: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1091: astore #16
/*     */     //   1093: aload #15
/*     */     //   1095: invokeinterface hasNext : ()Z
/*     */     //   1100: ifne -> 1108
/*     */     //   1103: aload #16
/*     */     //   1105: goto -> 1190
/*     */     //   1108: aload #16
/*     */     //   1110: checkcast kotlin/Pair
/*     */     //   1113: astore #17
/*     */     //   1115: iconst_0
/*     */     //   1116: istore #18
/*     */     //   1118: aload #17
/*     */     //   1120: invokevirtual getSecond : ()Ljava/lang/Object;
/*     */     //   1123: checkcast java/lang/Number
/*     */     //   1126: invokevirtual intValue : ()I
/*     */     //   1129: istore #17
/*     */     //   1131: aload #15
/*     */     //   1133: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1138: astore #18
/*     */     //   1140: aload #18
/*     */     //   1142: checkcast kotlin/Pair
/*     */     //   1145: astore #19
/*     */     //   1147: iconst_0
/*     */     //   1148: istore #20
/*     */     //   1150: aload #19
/*     */     //   1152: invokevirtual getSecond : ()Ljava/lang/Object;
/*     */     //   1155: checkcast java/lang/Number
/*     */     //   1158: invokevirtual intValue : ()I
/*     */     //   1161: istore #19
/*     */     //   1163: iload #17
/*     */     //   1165: iload #19
/*     */     //   1167: if_icmple -> 1178
/*     */     //   1170: aload #18
/*     */     //   1172: astore #16
/*     */     //   1174: iload #19
/*     */     //   1176: istore #17
/*     */     //   1178: aload #15
/*     */     //   1180: invokeinterface hasNext : ()Z
/*     */     //   1185: ifne -> 1131
/*     */     //   1188: aload #16
/*     */     //   1190: checkcast kotlin/Pair
/*     */     //   1193: invokevirtual getFirst : ()Ljava/lang/Object;
/*     */     //   1196: dup
/*     */     //   1197: ldc_w 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage'
/*     */     //   1200: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1203: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   1206: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   1209: areturn
/*     */     //   1210: new java/lang/IllegalStateException
/*     */     //   1213: dup
/*     */     //   1214: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1216: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1219: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #220	-> 63
/*     */     //   #227	-> 101
/*     */     //   #282	-> 110
/*     */     //   #283	-> 136
/*     */     //   #284	-> 164
/*     */     //   #228	-> 178
/*     */     //   #229	-> 193
/*     */     //   #220	-> 284
/*     */     //   #229	-> 386
/*     */     //   #284	-> 392
/*     */     //   #285	-> 401
/*     */     //   #282	-> 406
/*     */     //   #227	-> 407
/*     */     //   #232	-> 409
/*     */     //   #286	-> 419
/*     */     //   #287	-> 444
/*     */     //   #232	-> 482
/*     */     //   #287	-> 492
/*     */     //   #288	-> 499
/*     */     //   #232	-> 500
/*     */     //   #233	-> 503
/*     */     //   #234	-> 534
/*     */     //   #237	-> 560
/*     */     //   #289	-> 580
/*     */     //   #290	-> 599
/*     */     //   #237	-> 637
/*     */     //   #290	-> 650
/*     */     //   #291	-> 666
/*     */     //   #289	-> 671
/*     */     //   #237	-> 677
/*     */     //   #292	-> 680
/*     */     //   #293	-> 706
/*     */     //   #294	-> 734
/*     */     //   #237	-> 748
/*     */     //   #294	-> 759
/*     */     //   #295	-> 768
/*     */     //   #292	-> 773
/*     */     //   #237	-> 774
/*     */     //   #239	-> 776
/*     */     //   #240	-> 799
/*     */     //   #296	-> 814
/*     */     //   #240	-> 831
/*     */     //   #241	-> 833
/*     */     //   #220	-> 910
/*     */     //   #241	-> 933
/*     */     //   #239	-> 942
/*     */     //   #239	-> 943
/*     */     //   #242	-> 948
/*     */     //   #239	-> 971
/*     */     //   #244	-> 973
/*     */     //   #245	-> 980
/*     */     //   #246	-> 987
/*     */     //   #248	-> 1036
/*     */     //   #297	-> 1057
/*     */     //   #298	-> 1066
/*     */     //   #299	-> 1084
/*     */     //   #300	-> 1093
/*     */     //   #301	-> 1108
/*     */     //   #248	-> 1118
/*     */     //   #301	-> 1129
/*     */     //   #303	-> 1131
/*     */     //   #304	-> 1140
/*     */     //   #248	-> 1150
/*     */     //   #304	-> 1161
/*     */     //   #305	-> 1163
/*     */     //   #306	-> 1170
/*     */     //   #307	-> 1174
/*     */     //   #309	-> 1178
/*     */     //   #310	-> 1188
/*     */     //   #248	-> 1193
/*     */     //   #220	-> 1210
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	186	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker;
/*     */     //   379	10	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker;
/*     */     //   389	18	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker;
/*     */     //   407	37	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker;
/*     */     //   444	48	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker;
/*     */     //   492	7	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker;
/*     */     //   499	1	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker;
/*     */     //   500	3	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker;
/*     */     //   560	90	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker;
/*     */     //   650	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker;
/*     */     //   672	84	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker;
/*     */     //   756	18	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker;
/*     */     //   774	16	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker;
/*     */     //   101	186	1	actions	Ljava/util/List;
/*     */     //   370	19	1	actions	Ljava/util/List;
/*     */     //   389	18	1	actions	Ljava/util/List;
/*     */     //   407	37	1	actions	Ljava/util/List;
/*     */     //   444	48	1	actions	Ljava/util/List;
/*     */     //   492	7	1	actions	Ljava/util/List;
/*     */     //   499	1	1	actions	Ljava/util/List;
/*     */     //   500	56	1	actions	Ljava/util/List;
/*     */     //   560	17	1	actions	Ljava/util/List;
/*     */     //   101	186	2	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   361	28	2	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   389	18	2	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   407	37	2	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   444	48	2	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   492	7	2	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   499	1	2	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   500	3	2	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   560	90	2	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   650	22	2	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   672	84	2	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   756	18	2	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   774	37	2	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   101	186	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   352	37	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   389	18	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   407	37	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   444	48	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   492	7	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   499	1	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   500	3	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   560	90	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   650	22	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   672	84	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   756	18	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   774	130	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   101	186	4	attempt	I
/*     */     //   303	86	4	attempt	I
/*     */     //   389	18	4	attempt	I
/*     */     //   407	37	4	attempt	I
/*     */     //   444	48	4	attempt	I
/*     */     //   492	7	4	attempt	I
/*     */     //   499	1	4	attempt	I
/*     */     //   500	3	4	attempt	I
/*     */     //   560	90	4	attempt	I
/*     */     //   650	22	4	attempt	I
/*     */     //   672	84	4	attempt	I
/*     */     //   756	18	4	attempt	I
/*     */     //   774	16	4	attempt	I
/*     */     //   101	186	5	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;
/*     */     //   343	46	5	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;
/*     */     //   389	18	5	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;
/*     */     //   407	37	5	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;
/*     */     //   444	48	5	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;
/*     */     //   492	7	5	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;
/*     */     //   499	1	5	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;
/*     */     //   500	3	5	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;
/*     */     //   560	90	5	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;
/*     */     //   650	22	5	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;
/*     */     //   672	84	5	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;
/*     */     //   756	18	5	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;
/*     */     //   774	16	5	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;
/*     */     //   409	35	7	errorsCausedByEdits	Ljava/util/List;
/*     */     //   444	48	7	errorsCausedByEdits	Ljava/util/List;
/*     */     //   492	7	7	errorsCausedByEdits	Ljava/util/List;
/*     */     //   499	1	7	errorsCausedByEdits	Ljava/util/List;
/*     */     //   500	34	7	errorsCausedByEdits	Ljava/util/List;
/*     */     //   560	17	7	errorsCausedByEdits	Ljava/util/List;
/*     */     //   107	26	8	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   416	28	8	$this$all$iv	Ljava/lang/Iterable;
/*     */     //   444	9	8	$this$all$iv	Ljava/lang/Iterable;
/*     */     //   534	26	8	errorMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   776	137	8	actionsFiltered	Ljava/util/List;
/*     */     //   926	16	8	actionsFiltered	Ljava/util/List;
/*     */     //   942	1	8	actionsFiltered	Ljava/util/List;
/*     */     //   943	4	8	actionsFiltered	Ljava/util/List;
/*     */     //   947	24	8	actionsFiltered	Ljava/util/List;
/*     */     //   577	19	9	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   677	26	9	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   973	14	9	critiqueResponse	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse;
/*     */     //   133	12	10	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   980	56	10	ranks	Ljava/util/List;
/*     */     //   1036	18	10	ranks	Ljava/util/List;
/*     */     //   133	154	11	destination$iv$iv	Ljava/util/Collection;
/*     */     //   333	70	11	destination$iv$iv	Ljava/util/Collection;
/*     */     //   472	7	11	element$iv	Ljava/lang/Object;
/*     */     //   596	12	11	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   703	12	11	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   987	49	11	candidates	Ljava/util/List;
/*     */     //   1036	18	11	candidates	Ljava/util/List;
/*     */     //   479	12	12	it	Ljava/lang/String;
/*     */     //   596	72	12	destination$iv$iv	Ljava/util/Collection;
/*     */     //   703	67	12	destination$iv$iv	Ljava/util/Collection;
/*     */     //   796	35	13	it	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   1054	12	13	$this$minBy$iv	Ljava/lang/Iterable;
/*     */     //   164	11	14	item$iv$iv	Ljava/lang/Object;
/*     */     //   175	18	15	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   627	36	15	element$iv$iv	Ljava/lang/Object;
/*     */     //   734	31	15	item$iv$iv	Ljava/lang/Object;
/*     */     //   811	20	15	input$iv	Ljava/lang/Object;
/*     */     //   1066	18	15	iterator$iv	Ljava/util/Iterator;
/*     */     //   1084	24	15	iterator$iv	Ljava/util/Iterator;
/*     */     //   1108	21	15	iterator$iv	Ljava/util/Iterator;
/*     */     //   1129	32	15	iterator$iv	Ljava/util/Iterator;
/*     */     //   1161	29	15	iterator$iv	Ljava/util/Iterator;
/*     */     //   634	15	16	it	Lkotlin/Pair;
/*     */     //   745	11	16	it	Lkotlin/Pair;
/*     */     //   1093	15	16	minElem$iv	Ljava/lang/Object;
/*     */     //   1108	21	16	minElem$iv	Ljava/lang/Object;
/*     */     //   1129	32	16	minElem$iv	Ljava/lang/Object;
/*     */     //   1161	9	16	minElem$iv	Ljava/lang/Object;
/*     */     //   1174	16	16	minElem$iv	Ljava/lang/Object;
/*     */     //   193	85	17	actionRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;
/*     */     //   833	71	17	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   1115	14	17	it	Lkotlin/Pair;
/*     */     //   1131	30	17	minValue$iv	I
/*     */     //   1161	9	17	minValue$iv	I
/*     */     //   1178	12	17	minValue$iv	I
/*     */     //   1140	38	18	e$iv	Ljava/lang/Object;
/*     */     //   1147	14	19	it	Lkotlin/Pair;
/*     */     //   1163	15	19	v$iv	I
/*     */     //   178	109	16	$i$a$-map-AbstractEditWorker$checkAndSortActions$errorsCausedByEdits$1	I
/*     */     //   136	151	12	$i$f$mapTo	I
/*     */     //   110	177	9	$i$f$map	I
/*     */     //   482	10	13	$i$a$-all-AbstractEditWorker$checkAndSortActions$2	I
/*     */     //   419	81	9	$i$f$all	I
/*     */     //   637	13	17	$i$a$-filter-AbstractEditWorker$checkAndSortActions$actionsFiltered$1	I
/*     */     //   599	69	13	$i$f$filterTo	I
/*     */     //   580	92	10	$i$f$filter	I
/*     */     //   748	8	17	$i$a$-map-AbstractEditWorker$checkAndSortActions$actionsFiltered$2	I
/*     */     //   706	64	13	$i$f$mapTo	I
/*     */     //   680	94	10	$i$f$map	I
/*     */     //   814	17	16	$i$f$artifactRequest	I
/*     */     //   799	114	14	$i$a$-let-AbstractEditWorker$checkAndSortActions$critiqueResponse$1	I
/*     */     //   1118	11	18	$i$a$-minByOrThrow-AbstractEditWorker$checkAndSortActions$3	I
/*     */     //   1150	11	20	$i$a$-minByOrThrow-AbstractEditWorker$checkAndSortActions$3	I
/*     */     //   1057	133	14	$i$f$minByOrThrow	I
/*     */     //   0	1220	6	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	1157	23	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	1150	22	$result	Ljava/lang/Object;
/*     */     //   296	93	16	$i$a$-map-AbstractEditWorker$checkAndSortActions$errorsCausedByEdits$1	I
/*     */     //   293	110	12	$i$f$mapTo	I
/*     */     //   290	117	9	$i$f$map	I
/*     */     //   916	26	14	$i$a$-let-AbstractEditWorker$checkAndSortActions$critiqueResponse$1	I
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public abstract String getCritiqueArtifactNameSuffix();
/*     */   
/*     */   @Nullable
/*     */   public abstract Object getTrajectoryElementAgent(@NotNull MatterhornPropertyProvider paramMatterhornPropertyProvider, @NotNull Continuation<? super TrajectoryElementAgent> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   public Object getAgentParameters(@NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation<? super EditAgentParameters> $completion) {
/*     */     return getAgentParameters$suspendImpl(this, propertyProvider, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object produceArtifact(@NotNull AgentState input, @NotNull ExecutionContext context, @NotNull Continuation<? super ArtifactResponse<EditAgentResponse>> $completion) {
/*     */     return produceArtifact$suspendImpl(this, input, context, $completion);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public abstract List<AgentAction> getAvailableActions(@NotNull ExecutionAgentContext paramExecutionAgentContext);
/*     */   
/*     */   @Nullable
/*     */   public abstract Object runCritic(@NotNull ExecutionAgentContext paramExecutionAgentContext, int paramInt, @NotNull AgentState paramAgentState, @NotNull List<? extends MatterhornChatElement> paramList, @NotNull Continuation<? super List<? extends MatterhornChatElement>> paramContinuation);
/*     */   
/*     */   @NotNull
/*     */   public abstract String getSystemMessage(@NotNull ExecutionAgentContext paramExecutionAgentContext);
/*     */   
/*     */   @NotNull
/*     */   public abstract String getDemonstration(@NotNull ExecutionAgentContext paramExecutionAgentContext);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\edit_workers\AbstractEditWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
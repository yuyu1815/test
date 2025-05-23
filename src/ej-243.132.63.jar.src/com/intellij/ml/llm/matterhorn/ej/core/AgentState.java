/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage$;
/*    */ import java.util.List;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\b\n\002\020\b\n\000\n\002\030\002\n\002\b\037\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 E2\0020\001:\002DEB\001\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005\022\n\b\002\020\007\032\004\030\0010\b\022\n\b\002\020\t\032\004\030\0010\b\022\n\b\002\020\n\032\004\030\0010\013\022\016\b\002\020\f\032\b\022\004\022\0020\r0\005\022\n\b\002\020\016\032\004\030\0010\b\022\n\b\002\020\017\032\004\030\0010\b\022\n\b\002\020\020\032\004\030\0010\b\022\n\b\002\020\021\032\004\030\0010\013\022\n\b\002\020\022\032\004\030\0010\b¢\006\004\b\023\020\024B\001\b\020\022\006\020\025\032\0020\026\022\b\020\002\032\004\030\0010\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\b\022\b\020\n\032\004\030\0010\013\022\016\020\f\032\n\022\004\022\0020\r\030\0010\005\022\b\020\016\032\004\030\0010\b\022\b\020\017\032\004\030\0010\b\022\b\020\020\032\004\030\0010\b\022\b\020\021\032\004\030\0010\013\022\b\020\022\032\004\030\0010\b\022\b\020\027\032\004\030\0010\030¢\006\004\b\023\020\031J\006\020)\032\0020\013J\006\020*\032\0020\013J\t\020+\032\0020\003HÆ\003J\017\020,\032\b\022\004\022\0020\0060\005HÆ\003J\013\020-\032\004\030\0010\bHÆ\003J\013\020.\032\004\030\0010\bHÆ\003J\013\020/\032\004\030\0010\013HÆ\003J\017\0200\032\b\022\004\022\0020\r0\005HÆ\003J\013\0201\032\004\030\0010\bHÆ\003J\013\0202\032\004\030\0010\bHÆ\003J\013\0203\032\004\030\0010\bHÆ\003J\013\0204\032\004\030\0010\013HÆ\003J\013\0205\032\004\030\0010\bHÆ\003J\001\0206\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\n\b\002\020\007\032\004\030\0010\b2\n\b\002\020\t\032\004\030\0010\b2\n\b\002\020\n\032\004\030\0010\0132\016\b\002\020\f\032\b\022\004\022\0020\r0\0052\n\b\002\020\016\032\004\030\0010\b2\n\b\002\020\017\032\004\030\0010\b2\n\b\002\020\020\032\004\030\0010\b2\n\b\002\020\021\032\004\030\0010\0132\n\b\002\020\022\032\004\030\0010\bHÆ\001J\023\0207\032\002082\b\0209\032\004\030\0010\001HÖ\003J\t\020:\032\0020\026HÖ\001J\t\020;\032\0020\013HÖ\001J%\020<\032\0020=2\006\020>\032\0020\0002\006\020?\032\0020@2\006\020A\032\0020BH\001¢\006\002\bCR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\032\020\033R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\034\020\035R\023\020\007\032\004\030\0010\b¢\006\b\n\000\032\004\b\036\020\037R\023\020\t\032\004\030\0010\b¢\006\b\n\000\032\004\b \020\037R\023\020\n\032\004\030\0010\013¢\006\b\n\000\032\004\b!\020\"R\027\020\f\032\b\022\004\022\0020\r0\005¢\006\b\n\000\032\004\b#\020\035R\023\020\016\032\004\030\0010\b¢\006\b\n\000\032\004\b$\020\037R\023\020\017\032\004\030\0010\b¢\006\b\n\000\032\004\b%\020\037R\023\020\020\032\004\030\0010\b¢\006\b\n\000\032\004\b&\020\037R\023\020\021\032\004\030\0010\013¢\006\b\n\000\032\004\b'\020\"R\023\020\022\032\004\030\0010\b¢\006\b\n\000\032\004\b(\020\037¨\006F"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "", "issue", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "observations", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;", "demo", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;", "relevantSymbolsResponse", "systemMessage", "", "issueDescription", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "ideInitialState", "guidelines", "explicitlySelectedContextFiles", "recommendedSteps", "projectStr", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIssue", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "getObservations", "()Ljava/util/List;", "getDemo", "()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;", "getRelevantSymbolsResponse", "getSystemMessage", "()Ljava/lang/String;", "getIssueDescription", "getIdeInitialState", "getGuidelines", "getExplicitlySelectedContextFiles", "getRecommendedSteps", "getProjectStr", "shortPresentableHistory", "presentableHistory", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class AgentState {
/*    */   @NotNull
/* 34 */   public static final Companion Companion = new Companion(null); @NotNull private final AgentIssue issue; @NotNull private final List<AgentObservation> observations; @Nullable private final MatterhornChatMessage demo; @Nullable private final MatterhornChatMessage relevantSymbolsResponse; @Nullable private final String systemMessage; @NotNull private final List<MatterhornChatElement> issueDescription; @Nullable private final MatterhornChatMessage ideInitialState; @Nullable private final MatterhornChatMessage guidelines; @Nullable private final MatterhornChatMessage explicitlySelectedContextFiles; @Nullable private final String recommendedSteps; @Nullable private final MatterhornChatMessage projectStr; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer1 = new KSerializer[11]; arrayOfKSerializer1[0] = null; arrayOfKSerializer1[1] = (KSerializer)new ArrayListSerializer((KSerializer)AgentObservation.$serializer.INSTANCE); arrayOfKSerializer1[2] = null; arrayOfKSerializer1[3] = null; arrayOfKSerializer1[4] = null; KClass[] arrayOfKClass = new KClass[4]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(MatterhornAssistantChatMessageWithToolUses.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(MatterhornChatMessage.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(MatterhornMultiPartChatMessage.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(MatterhornUserChatMessageWithToolResults.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[4]; arrayOfKSerializer2[0] = (KSerializer)MatterhornAssistantChatMessageWithToolUses$.serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)MatterhornChatMessage$.serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)MatterhornMultiPartChatMessage$.serializer.INSTANCE; arrayOfKSerializer2[3] = (KSerializer)MatterhornUserChatMessageWithToolResults$.serializer.INSTANCE; arrayOfKSerializer1[5] = (KSerializer)new ArrayListSerializer((KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement", Reflection.getOrCreateKotlinClass(MatterhornChatElement.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0])); arrayOfKSerializer1[6] = null; arrayOfKSerializer1[7] = null; arrayOfKSerializer1[8] = null; arrayOfKSerializer1[9] = null; arrayOfKSerializer1[10] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AgentState> serializer() { return (KSerializer<AgentState>)AgentState.$serializer.INSTANCE; }
/*    */      }
/* 36 */   public AgentState(@NotNull AgentIssue issue, @NotNull List<AgentObservation> observations, @Nullable MatterhornChatMessage demo, @Nullable MatterhornChatMessage relevantSymbolsResponse, @Nullable String systemMessage, @NotNull List<MatterhornChatElement> issueDescription, @Nullable MatterhornChatMessage ideInitialState, @Nullable MatterhornChatMessage guidelines, @Nullable MatterhornChatMessage explicitlySelectedContextFiles, @Nullable String recommendedSteps, @Nullable MatterhornChatMessage projectStr) { this.issue = issue;
/* 37 */     this.observations = observations;
/* 38 */     this.demo = demo;
/* 39 */     this.relevantSymbolsResponse = relevantSymbolsResponse;
/* 40 */     this.systemMessage = systemMessage;
/* 41 */     this.issueDescription = issueDescription;
/* 42 */     this.ideInitialState = ideInitialState;
/* 43 */     this.guidelines = guidelines;
/* 44 */     this.explicitlySelectedContextFiles = explicitlySelectedContextFiles;
/* 45 */     this.recommendedSteps = recommendedSteps;
/* 46 */     this.projectStr = projectStr; } @NotNull public final AgentIssue getIssue() { return this.issue; } @NotNull public final List<AgentObservation> getObservations() { return this.observations; } @Nullable public final MatterhornChatMessage getDemo() { return this.demo; } @Nullable public final MatterhornChatMessage getRelevantSymbolsResponse() { return this.relevantSymbolsResponse; } @Nullable public final String getSystemMessage() { return this.systemMessage; } @Nullable public final MatterhornChatMessage getProjectStr() { return this.projectStr; }
/*    */   @NotNull public final List<MatterhornChatElement> getIssueDescription() { return this.issueDescription; }
/*    */   @Nullable public final MatterhornChatMessage getIdeInitialState() { return this.ideInitialState; }
/*    */   @Nullable public final MatterhornChatMessage getGuidelines() { return this.guidelines; }
/* 50 */   @Nullable public final MatterhornChatMessage getExplicitlySelectedContextFiles() { return this.explicitlySelectedContextFiles; } @Nullable public final String getRecommendedSteps() { return this.recommendedSteps; } @NotNull public final String shortPresentableHistory() { return CollectionsKt.joinToString$default(this.observations, "\n", null, null, 0, null, AgentState::shortPresentableHistory$lambda$0, 30, null); } private static final CharSequence shortPresentableHistory$lambda$0(AgentObservation it) {
/* 51 */     Intrinsics.checkNotNullParameter(it, "it"); String content = 
/* 52 */       (it.getElement() instanceof MatterhornAssistantChatMessageWithToolUses) ? it.toString() : 
/* 53 */       it.getElement().getContent();
/*    */     
/* 55 */     return "" + it.getElement().getKind() + ":\n" + it.getElement().getKind() + "\n";
/*    */   }
/*    */   
/*    */   @NotNull
/* 59 */   public final String presentableHistory() { return CollectionsKt.joinToString$default(this.observations, "\n", null, null, 0, null, AgentState::presentableHistory$lambda$1, 30, null); } private static final CharSequence presentableHistory$lambda$1(AgentObservation it) {
/* 60 */     Intrinsics.checkNotNullParameter(it, "it"); String content = 
/* 61 */       (it.getElement() instanceof MatterhornAssistantChatMessageWithToolUses) ? it.toString() : 
/* 62 */       it.getElement().getContent();
/*    */     
/* 64 */     return "" + it.getElement().getKind() + ":\n" + it.getElement().getKind() + "\n";
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AgentIssue component1() {
/*    */     return this.issue;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<AgentObservation> component2() {
/*    */     return this.observations;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final MatterhornChatMessage component3() {
/*    */     return this.demo;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final MatterhornChatMessage component4() {
/*    */     return this.relevantSymbolsResponse;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component5() {
/*    */     return this.systemMessage;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<MatterhornChatElement> component6() {
/*    */     return this.issueDescription;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final MatterhornChatMessage component7() {
/*    */     return this.ideInitialState;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final MatterhornChatMessage component8() {
/*    */     return this.guidelines;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final MatterhornChatMessage component9() {
/*    */     return this.explicitlySelectedContextFiles;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component10() {
/*    */     return this.recommendedSteps;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final MatterhornChatMessage component11() {
/*    */     return this.projectStr;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AgentState copy(@NotNull AgentIssue issue, @NotNull List<AgentObservation> observations, @Nullable MatterhornChatMessage demo, @Nullable MatterhornChatMessage relevantSymbolsResponse, @Nullable String systemMessage, @NotNull List<? extends MatterhornChatElement> issueDescription, @Nullable MatterhornChatMessage ideInitialState, @Nullable MatterhornChatMessage guidelines, @Nullable MatterhornChatMessage explicitlySelectedContextFiles, @Nullable String recommendedSteps, @Nullable MatterhornChatMessage projectStr) {
/*    */     Intrinsics.checkNotNullParameter(issue, "issue");
/*    */     Intrinsics.checkNotNullParameter(observations, "observations");
/*    */     Intrinsics.checkNotNullParameter(issueDescription, "issueDescription");
/*    */     return new AgentState(issue, observations, demo, relevantSymbolsResponse, systemMessage, issueDescription, ideInitialState, guidelines, explicitlySelectedContextFiles, recommendedSteps, projectStr);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AgentState(issue=" + this.issue + ", observations=" + this.observations + ", demo=" + this.demo + ", relevantSymbolsResponse=" + this.relevantSymbolsResponse + ", systemMessage=" + this.systemMessage + ", issueDescription=" + this.issueDescription + ", ideInitialState=" + this.ideInitialState + ", guidelines=" + this.guidelines + ", explicitlySelectedContextFiles=" + this.explicitlySelectedContextFiles + ", recommendedSteps=" + this.recommendedSteps + ", projectStr=" + this.projectStr + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.issue.hashCode();
/*    */     result = result * 31 + this.observations.hashCode();
/*    */     result = result * 31 + ((this.demo == null) ? 0 : this.demo.hashCode());
/*    */     result = result * 31 + ((this.relevantSymbolsResponse == null) ? 0 : this.relevantSymbolsResponse.hashCode());
/*    */     result = result * 31 + ((this.systemMessage == null) ? 0 : this.systemMessage.hashCode());
/*    */     result = result * 31 + this.issueDescription.hashCode();
/*    */     result = result * 31 + ((this.ideInitialState == null) ? 0 : this.ideInitialState.hashCode());
/*    */     result = result * 31 + ((this.guidelines == null) ? 0 : this.guidelines.hashCode());
/*    */     result = result * 31 + ((this.explicitlySelectedContextFiles == null) ? 0 : this.explicitlySelectedContextFiles.hashCode());
/*    */     result = result * 31 + ((this.recommendedSteps == null) ? 0 : this.recommendedSteps.hashCode());
/*    */     return result * 31 + ((this.projectStr == null) ? 0 : this.projectStr.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AgentState))
/*    */       return false; 
/*    */     AgentState agentState = (AgentState)other;
/*    */     return !Intrinsics.areEqual(this.issue, agentState.issue) ? false : (!Intrinsics.areEqual(this.observations, agentState.observations) ? false : (!Intrinsics.areEqual(this.demo, agentState.demo) ? false : (!Intrinsics.areEqual(this.relevantSymbolsResponse, agentState.relevantSymbolsResponse) ? false : (!Intrinsics.areEqual(this.systemMessage, agentState.systemMessage) ? false : (!Intrinsics.areEqual(this.issueDescription, agentState.issueDescription) ? false : (!Intrinsics.areEqual(this.ideInitialState, agentState.ideInitialState) ? false : (!Intrinsics.areEqual(this.guidelines, agentState.guidelines) ? false : (!Intrinsics.areEqual(this.explicitlySelectedContextFiles, agentState.explicitlySelectedContextFiles) ? false : (!Intrinsics.areEqual(this.recommendedSteps, agentState.recommendedSteps) ? false : (!!Intrinsics.areEqual(this.projectStr, agentState.projectStr)))))))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
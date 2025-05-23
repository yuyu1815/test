/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ import java.util.List;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020 \n\000\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\031\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 92\0020\001:\00289BQ\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005\022\016\020\b\032\n\022\004\022\0020\005\030\0010\t\022\016\020\n\032\n\022\004\022\0020\013\030\0010\t\022\b\b\002\020\f\032\0020\005¢\006\004\b\r\020\016Bm\b\020\022\006\020\017\032\0020\013\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\005\022\016\020\b\032\n\022\004\022\0020\005\030\0010\t\022\016\020\n\032\n\022\004\022\0020\013\030\0010\t\022\b\020\f\032\004\030\0010\005\022\b\020\020\032\004\030\0010\021¢\006\004\b\r\020\022J\020\020 \032\0020\0012\006\020!\032\0020\005H\026J\t\020\"\032\0020\003HÆ\003J\t\020#\032\0020\005HÆ\003J\t\020$\032\0020\005HÆ\003J\t\020%\032\0020\005HÆ\003J\021\020&\032\n\022\004\022\0020\005\030\0010\tHÆ\003J\021\020'\032\n\022\004\022\0020\013\030\0010\tHÆ\003J\t\020(\032\0020\005HÆ\003J_\020)\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\0052\020\b\002\020\b\032\n\022\004\022\0020\005\030\0010\t2\020\b\002\020\n\032\n\022\004\022\0020\013\030\0010\t2\b\b\002\020\f\032\0020\005HÆ\001J\023\020*\032\0020+2\b\020,\032\004\030\0010-HÖ\003J\t\020.\032\0020\013HÖ\001J\t\020/\032\0020\005HÖ\001J%\0200\032\002012\006\0202\032\0020\0002\006\0203\032\002042\006\0205\032\00206H\001¢\006\002\b7R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\023\020\024R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\025\020\026R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\027\020\026R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\030\020\026R$\020\b\032\n\022\004\022\0020\005\030\0010\t8\006X\004¢\006\016\n\000\022\004\b\031\020\032\032\004\b\033\020\034R$\020\n\032\n\022\004\022\0020\013\030\0010\t8\006X\004¢\006\016\n\000\022\004\b\035\020\032\032\004\b\036\020\034R\021\020\f\032\0020\005¢\006\b\n\000\032\004\b\037\020\026¨\006:"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/AssistantTrajectoryElement;", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;", "subagent", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;", "content", "", "thought", "action", "critiqueCandidates", "", "critiqueRanks", "", "role", "<init>", "(Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSubagent", "()Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;", "getContent", "()Ljava/lang/String;", "getThought", "getAction", "getCritiqueCandidates$annotations", "()V", "getCritiqueCandidates", "()Ljava/util/List;", "getCritiqueRanks$annotations", "getCritiqueRanks", "getRole", "withId", "agentId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*    */ public final class AssistantTrajectoryElement implements TrajectoryElement {
/*    */   @NotNull
/* 32 */   public static final Companion Companion = new Companion(null); @NotNull private final TrajectoryElementAgent subagent; @NotNull private final String content; @NotNull private final String thought; @NotNull private final String action; @Nullable private final List<String> critiqueCandidates; @Nullable private final List<Integer> critiqueRanks; @NotNull private final String role; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[7]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[5] = (KSerializer)new ArrayListSerializer((KSerializer)IntSerializer.INSTANCE); arrayOfKSerializer[6] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/AssistantTrajectoryElement$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/AssistantTrajectoryElement;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AssistantTrajectoryElement> serializer() { return (KSerializer<AssistantTrajectoryElement>)AssistantTrajectoryElement.$serializer.INSTANCE; }
/*    */      }
/* 34 */   public AssistantTrajectoryElement(@NotNull TrajectoryElementAgent subagent, @NotNull String content, @NotNull String thought, @NotNull String action, @Nullable List<String> critiqueCandidates, @Nullable List<Integer> critiqueRanks, @NotNull String role) { this.subagent = subagent;
/* 35 */     this.content = content;
/* 36 */     this.thought = thought;
/* 37 */     this.action = action;
/* 38 */     this.critiqueCandidates = critiqueCandidates;
/*    */     
/* 40 */     this.critiqueRanks = critiqueRanks;
/*    */     
/* 42 */     this.role = role; } @NotNull public TrajectoryElementAgent getSubagent() { return this.subagent; } @NotNull public final String getContent() { return this.content; } @NotNull public final String getThought() { return this.thought; } @NotNull public final String getRole() { return this.role; }
/*    */   @NotNull public final String getAction() { return this.action; }
/*    */   @Nullable public final List<String> getCritiqueCandidates() { return this.critiqueCandidates; }
/*    */   @Nullable public final List<Integer> getCritiqueRanks() { return this.critiqueRanks; } @NotNull
/* 46 */   public TrajectoryElement withId(@NotNull String agentId) { Intrinsics.checkNotNullParameter(agentId, "agentId"); return copy$default(this, TrajectoryElementAgent.copy$default(getSubagent(), null, null, null, null, agentId, 15, null), null, null, null, null, null, null, 126, null); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TrajectoryElementAgent component1() {
/*    */     return this.subagent;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.thought;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component4() {
/*    */     return this.action;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final List<String> component5() {
/*    */     return this.critiqueCandidates;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final List<Integer> component6() {
/*    */     return this.critiqueRanks;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component7() {
/*    */     return this.role;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AssistantTrajectoryElement copy(@NotNull TrajectoryElementAgent subagent, @NotNull String content, @NotNull String thought, @NotNull String action, @Nullable List<String> critiqueCandidates, @Nullable List<Integer> critiqueRanks, @NotNull String role) {
/*    */     Intrinsics.checkNotNullParameter(subagent, "subagent");
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     Intrinsics.checkNotNullParameter(thought, "thought");
/*    */     Intrinsics.checkNotNullParameter(action, "action");
/*    */     Intrinsics.checkNotNullParameter(role, "role");
/*    */     return new AssistantTrajectoryElement(subagent, content, thought, action, critiqueCandidates, critiqueRanks, role);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AssistantTrajectoryElement(subagent=" + this.subagent + ", content=" + this.content + ", thought=" + this.thought + ", action=" + this.action + ", critiqueCandidates=" + this.critiqueCandidates + ", critiqueRanks=" + this.critiqueRanks + ", role=" + this.role + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.subagent.hashCode();
/*    */     result = result * 31 + this.content.hashCode();
/*    */     result = result * 31 + this.thought.hashCode();
/*    */     result = result * 31 + this.action.hashCode();
/*    */     result = result * 31 + ((this.critiqueCandidates == null) ? 0 : this.critiqueCandidates.hashCode());
/*    */     result = result * 31 + ((this.critiqueRanks == null) ? 0 : this.critiqueRanks.hashCode());
/*    */     return result * 31 + this.role.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AssistantTrajectoryElement))
/*    */       return false; 
/*    */     AssistantTrajectoryElement assistantTrajectoryElement = (AssistantTrajectoryElement)other;
/*    */     return !Intrinsics.areEqual(this.subagent, assistantTrajectoryElement.subagent) ? false : (!Intrinsics.areEqual(this.content, assistantTrajectoryElement.content) ? false : (!Intrinsics.areEqual(this.thought, assistantTrajectoryElement.thought) ? false : (!Intrinsics.areEqual(this.action, assistantTrajectoryElement.action) ? false : (!Intrinsics.areEqual(this.critiqueCandidates, assistantTrajectoryElement.critiqueCandidates) ? false : (!Intrinsics.areEqual(this.critiqueRanks, assistantTrajectoryElement.critiqueRanks) ? false : (!!Intrinsics.areEqual(this.role, assistantTrajectoryElement.role)))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\AssistantTrajectoryElement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
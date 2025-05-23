/*    */ package com.intellij.ml.llm.matterhorn.llm;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\006\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 +2\0020\001:\002*+B;\022\f\020\002\032\b\022\004\022\0020\0040\003\022\006\020\005\032\0020\006\022\020\b\002\020\007\032\n\022\004\022\0020\b\030\0010\003\022\n\b\002\020\t\032\004\030\0010\006¢\006\004\b\n\020\013BO\b\020\022\006\020\f\032\0020\r\022\016\020\002\032\n\022\004\022\0020\004\030\0010\003\022\b\020\005\032\004\030\0010\006\022\016\020\007\032\n\022\004\022\0020\b\030\0010\003\022\b\020\t\032\004\030\0010\006\022\b\020\016\032\004\030\0010\017¢\006\004\b\n\020\020J\017\020\027\032\b\022\004\022\0020\0040\003HÆ\003J\t\020\030\032\0020\006HÆ\003J\021\020\031\032\n\022\004\022\0020\b\030\0010\003HÆ\003J\013\020\032\032\004\030\0010\006HÆ\003JA\020\033\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\b\b\002\020\005\032\0020\0062\020\b\002\020\007\032\n\022\004\022\0020\b\030\0010\0032\n\b\002\020\t\032\004\030\0010\006HÆ\001J\023\020\034\032\0020\0352\b\020\036\032\004\030\0010\037HÖ\003J\t\020 \032\0020\rHÖ\001J\t\020!\032\0020\006HÖ\001J%\020\"\032\0020#2\006\020$\032\0020\0002\006\020%\032\0020&2\006\020'\032\0020(H\001¢\006\002\b)R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\021\020\022R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\023\020\024R\034\020\007\032\n\022\004\022\0020\b\030\0010\003X\004¢\006\b\n\000\032\004\b\025\020\022R\026\020\t\032\004\030\0010\006X\004¢\006\b\n\000\032\004\b\026\020\024¨\006,"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/AIToolUseAnswerChoice;", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;", "usages", "", "Lcom/intellij/ml/llm/matterhorn/llm/AIToolUsage;", "content", "", "logits", "", "id", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUsages", "()Ljava/util/List;", "getContent", "()Ljava/lang/String;", "getLogits", "getId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*    */ public final class AIToolUseAnswerChoice implements AIAnswerChoice {
/*    */   @NotNull
/*    */   private final List<AIToolUsage> usages;
/*    */   @NotNull
/*    */   private final String content;
/*    */   @Nullable
/*    */   private final List<Double> logits;
/*    */   @NotNull
/* 29 */   public static final Companion Companion = new Companion(null); @Nullable private final String id; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)AIToolUsage.$serializer.INSTANCE); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = (KSerializer)new ArrayListSerializer((KSerializer)DoubleSerializer.INSTANCE); arrayOfKSerializer[3] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/AIToolUseAnswerChoice$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/AIToolUseAnswerChoice;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AIToolUseAnswerChoice> serializer() { return (KSerializer<AIToolUseAnswerChoice>)AIToolUseAnswerChoice.$serializer.INSTANCE; }
/*    */      }
/* 31 */   public AIToolUseAnswerChoice(@NotNull List<AIToolUsage> usages, @NotNull String content, @Nullable List<Double> logits, @Nullable String id) { this.usages = usages;
/* 32 */     this.content = content;
/* 33 */     this.logits = logits;
/* 34 */     this.id = id; } @NotNull public final List<AIToolUsage> getUsages() { return this.usages; } @Nullable public String getId() { return this.id; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public String getContent() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public List<Double> getLogits() {
/*    */     return this.logits;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<AIToolUsage> component1() {
/*    */     return this.usages;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final List<Double> component3() {
/*    */     return this.logits;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component4() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AIToolUseAnswerChoice copy(@NotNull List<AIToolUsage> usages, @NotNull String content, @Nullable List<Double> logits, @Nullable String id) {
/*    */     Intrinsics.checkNotNullParameter(usages, "usages");
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     return new AIToolUseAnswerChoice(usages, content, logits, id);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AIToolUseAnswerChoice(usages=" + this.usages + ", content=" + this.content + ", logits=" + this.logits + ", id=" + this.id + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.usages.hashCode();
/*    */     result = result * 31 + this.content.hashCode();
/*    */     result = result * 31 + ((this.logits == null) ? 0 : this.logits.hashCode());
/*    */     return result * 31 + ((this.id == null) ? 0 : this.id.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AIToolUseAnswerChoice))
/*    */       return false; 
/*    */     AIToolUseAnswerChoice aIToolUseAnswerChoice = (AIToolUseAnswerChoice)other;
/*    */     return !Intrinsics.areEqual(this.usages, aIToolUseAnswerChoice.usages) ? false : (!Intrinsics.areEqual(this.content, aIToolUseAnswerChoice.content) ? false : (!Intrinsics.areEqual(this.logits, aIToolUseAnswerChoice.logits) ? false : (!!Intrinsics.areEqual(this.id, aIToolUseAnswerChoice.id))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\llm\AIToolUseAnswerChoice.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
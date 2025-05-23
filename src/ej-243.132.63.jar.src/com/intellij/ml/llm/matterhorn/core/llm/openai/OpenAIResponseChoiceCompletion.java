/*    */ package com.intellij.ml.llm.matterhorn.core.llm.openai;
/*    */ 
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.LongSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\020\t\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\024\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 22\0020\001:\00212B+\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013BA\b\020\022\006\020\f\032\0020\r\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\016\032\004\030\0010\017¢\006\004\b\n\020\020J\t\020\036\032\0020\003HÆ\003J\t\020\037\032\0020\005HÆ\003J\013\020 \032\004\030\0010\007HÆ\003J\t\020!\032\0020\tHÆ\003J3\020\"\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0072\b\b\002\020\b\032\0020\tHÆ\001J\023\020#\032\0020$2\b\020%\032\004\030\0010&HÖ\003J\t\020'\032\0020\rHÖ\001J\t\020(\032\0020\005HÖ\001J%\020)\032\0020*2\006\020+\032\0020\0002\006\020,\032\0020-2\006\020.\032\0020/H\001¢\006\002\b0R\034\020\002\032\0020\0038\026X\004¢\006\016\n\000\022\004\b\021\020\022\032\004\b\023\020\024R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\025\020\022\032\004\b\026\020\027R\036\020\006\032\004\030\0010\0078\026X\004¢\006\016\n\000\022\004\b\030\020\022\032\004\b\031\020\032R\034\020\b\032\0020\t8\006X\004¢\006\016\n\000\022\004\b\033\020\022\032\004\b\034\020\035¨\0063"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoiceCompletion;", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoice;", "index", "", "text", "", "finishDetails", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/FinishDetails;", "logprobs", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseLogprobs;", "<init>", "(JLjava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/openai/FinishDetails;Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseLogprobs;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLjava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/openai/FinishDetails;Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseLogprobs;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIndex$annotations", "()V", "getIndex", "()J", "getText$annotations", "getText", "()Ljava/lang/String;", "getFinishDetails$annotations", "getFinishDetails", "()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/FinishDetails;", "getLogprobs$annotations", "getLogprobs", "()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseLogprobs;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class OpenAIResponseChoiceCompletion implements OpenAIResponseChoice {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long index;
/*    */   @NotNull
/*    */   private final String text;
/*    */   @Nullable
/*    */   private final FinishDetails finishDetails;
/*    */   @NotNull
/*    */   private final OpenAIResponseLogprobs logprobs;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoiceCompletion$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoiceCompletion;", "core-llm"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<OpenAIResponseChoiceCompletion> serializer() {
/* 44 */       return (KSerializer<OpenAIResponseChoiceCompletion>)OpenAIResponseChoiceCompletion.$serializer.INSTANCE;
/*    */     } }
/* 46 */   public OpenAIResponseChoiceCompletion(long index, @NotNull String text, @Nullable FinishDetails finishDetails, @NotNull OpenAIResponseLogprobs logprobs) { this.index = index;
/*    */ 
/*    */     
/* 49 */     this.text = text;
/*    */ 
/*    */     
/* 52 */     this.finishDetails = finishDetails;
/*    */ 
/*    */     
/* 55 */     this.logprobs = logprobs; } @NotNull public final OpenAIResponseLogprobs getLogprobs() { return this.logprobs; }
/*    */ 
/*    */   
/*    */   public long getIndex() {
/*    */     return this.index;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getText() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public FinishDetails getFinishDetails() {
/*    */     return this.finishDetails;
/*    */   }
/*    */   
/*    */   public final long component1() {
/*    */     return this.index;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final FinishDetails component3() {
/*    */     return this.finishDetails;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final OpenAIResponseLogprobs component4() {
/*    */     return this.logprobs;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final OpenAIResponseChoiceCompletion copy(long index, @NotNull String text, @Nullable FinishDetails finishDetails, @NotNull OpenAIResponseLogprobs logprobs) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     Intrinsics.checkNotNullParameter(logprobs, "logprobs");
/*    */     return new OpenAIResponseChoiceCompletion(index, text, finishDetails, logprobs);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "OpenAIResponseChoiceCompletion(index=" + this.index + ", text=" + this.text + ", finishDetails=" + this.finishDetails + ", logprobs=" + this.logprobs + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Long.hashCode(this.index);
/*    */     result = result * 31 + this.text.hashCode();
/*    */     result = result * 31 + ((this.finishDetails == null) ? 0 : this.finishDetails.hashCode());
/*    */     return result * 31 + this.logprobs.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof OpenAIResponseChoiceCompletion))
/*    */       return false; 
/*    */     OpenAIResponseChoiceCompletion openAIResponseChoiceCompletion = (OpenAIResponseChoiceCompletion)other;
/*    */     return (this.index != openAIResponseChoiceCompletion.index) ? false : (!Intrinsics.areEqual(this.text, openAIResponseChoiceCompletion.text) ? false : (!Intrinsics.areEqual(this.finishDetails, openAIResponseChoiceCompletion.finishDetails) ? false : (!!Intrinsics.areEqual(this.logprobs, openAIResponseChoiceCompletion.logprobs))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAIResponseChoiceCompletion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
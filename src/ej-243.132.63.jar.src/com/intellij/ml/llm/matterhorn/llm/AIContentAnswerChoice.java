/*    */ package com.intellij.ml.llm.matterhorn.llm;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\020\006\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 '2\0020\001:\002&'B-\022\006\020\002\032\0020\003\022\020\b\002\020\004\032\n\022\004\022\0020\006\030\0010\005\022\n\b\002\020\007\032\004\030\0010\003¢\006\004\b\b\020\tB?\b\020\022\006\020\n\032\0020\013\022\b\020\002\032\004\030\0010\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\003\022\b\020\f\032\004\030\0010\r¢\006\004\b\b\020\016J\t\020\024\032\0020\003HÆ\003J\021\020\025\032\n\022\004\022\0020\006\030\0010\005HÆ\003J\013\020\026\032\004\030\0010\003HÆ\003J1\020\027\032\0020\0002\b\b\002\020\002\032\0020\0032\020\b\002\020\004\032\n\022\004\022\0020\006\030\0010\0052\n\b\002\020\007\032\004\030\0010\003HÆ\001J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\033HÖ\003J\t\020\034\032\0020\013HÖ\001J\t\020\035\032\0020\003HÖ\001J%\020\036\032\0020\0372\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$H\001¢\006\002\b%R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\017\020\020R\034\020\004\032\n\022\004\022\0020\006\030\0010\005X\004¢\006\b\n\000\032\004\b\021\020\022R\026\020\007\032\004\030\0010\003X\004¢\006\b\n\000\032\004\b\023\020\020¨\006("}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/AIContentAnswerChoice;", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;", "content", "", "logits", "", "", "id", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContent", "()Ljava/lang/String;", "getLogits", "()Ljava/util/List;", "getId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*    */ public final class AIContentAnswerChoice implements AIAnswerChoice {
/*    */   @NotNull
/* 15 */   public static final Companion Companion = new Companion(null); @NotNull private final String content; @Nullable private final List<Double> logits; @Nullable private final String id; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)DoubleSerializer.INSTANCE); arrayOfKSerializer[2] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/AIContentAnswerChoice$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/AIContentAnswerChoice;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AIContentAnswerChoice> serializer() { return (KSerializer<AIContentAnswerChoice>)AIContentAnswerChoice.$serializer.INSTANCE; }
/*    */      }
/* 17 */    public AIContentAnswerChoice(@NotNull String content, @Nullable List<Double> logits, @Nullable String id) { this.content = content;
/* 18 */     this.logits = logits;
/* 19 */     this.id = id; } @NotNull public String getContent() { return this.content; } @Nullable public List<Double> getLogits() { return this.logits; } @Nullable public String getId() { return this.id; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final List<Double> component2() {
/*    */     return this.logits;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AIContentAnswerChoice copy(@NotNull String content, @Nullable List<Double> logits, @Nullable String id) {
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     return new AIContentAnswerChoice(content, logits, id);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AIContentAnswerChoice(content=" + this.content + ", logits=" + this.logits + ", id=" + this.id + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.content.hashCode();
/*    */     result = result * 31 + ((this.logits == null) ? 0 : this.logits.hashCode());
/*    */     return result * 31 + ((this.id == null) ? 0 : this.id.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AIContentAnswerChoice))
/*    */       return false; 
/*    */     AIContentAnswerChoice aIContentAnswerChoice = (AIContentAnswerChoice)other;
/*    */     return !Intrinsics.areEqual(this.content, aIContentAnswerChoice.content) ? false : (!Intrinsics.areEqual(this.logits, aIContentAnswerChoice.logits) ? false : (!!Intrinsics.areEqual(this.id, aIContentAnswerChoice.id)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\AIContentAnswerChoice.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
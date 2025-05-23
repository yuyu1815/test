/*    */ package com.intellij.ml.llm.matterhorn.llm;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.EventType;
/*    */ import com.intellij.ml.llm.matterhorn.PairedGroupEvent;
/*    */ import com.intellij.ml.llm.matterhorn.events.SerializableEvent;
/*    */ import com.intellij.ml.llm.matterhorn.events.SerializableThrowable;
/*    */ import com.intellij.ml.llm.matterhorn.events.SerializableThrowable$;
/*    */ import com.intellij.ml.llm.matterhorn.events.UUIDSerializer;
/*    */ import java.util.UUID;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @SerialName("LlmRequestFailed")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000j\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 /2\0020\0012\0020\002:\002./B\027\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\004\b\007\020\bB\035\b\026\022\n\020\003\032\0060\tj\002`\n\022\006\020\005\032\0020\006¢\006\004\b\007\020\013B/\b\020\022\006\020\f\032\0020\r\022\b\020\003\032\004\030\0010\004\022\b\020\005\032\004\030\0010\006\022\b\020\016\032\004\030\0010\017¢\006\004\b\007\020\020J\t\020\035\032\0020\004HÆ\003J\t\020\036\032\0020\006HÆ\003J\035\020\037\032\0020\0002\b\b\002\020\003\032\0020\0042\b\b\002\020\005\032\0020\006HÆ\001J\023\020 \032\0020!2\b\020\"\032\004\030\0010#HÖ\003J\t\020$\032\0020\rHÖ\001J\t\020%\032\0020\026HÖ\001J%\020&\032\0020'2\006\020(\032\0020\0002\006\020)\032\0020*2\006\020+\032\0020,H\001¢\006\002\b-R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\021\020\022R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\023\020\024R\024\020\025\032\0020\0268VX\004¢\006\006\032\004\b\027\020\030R\024\020\031\032\0020\0328VX\004¢\006\006\032\004\b\033\020\034¨\0060"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/LlmRequestFailed;", "Lcom/intellij/ml/llm/matterhorn/llm/LlmEvent;", "Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;", "exception", "Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;", "id", "Ljava/util/UUID;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;Ljava/util/UUID;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;Ljava/util/UUID;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getException", "()Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;", "getId", "()Ljava/util/UUID;", "groupKey", "", "getGroupKey", "()Ljava/lang/String;", "type", "Lcom/intellij/ml/llm/matterhorn/EventType;", "getType", "()Lcom/intellij/ml/llm/matterhorn/EventType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*    */ public final class LlmRequestFailed implements LlmEvent, PairedGroupEvent {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @NotNull
/* 37 */   public SerializableEvent toSerializable() { return LlmEvent.DefaultImpls.toSerializable(this); } @NotNull private final SerializableThrowable exception; @NotNull private final UUID id; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/LlmRequestFailed$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/LlmRequestFailed;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LlmRequestFailed> serializer() { return (KSerializer<LlmRequestFailed>)LlmRequestFailed.$serializer.INSTANCE; }
/*    */      }
/* 39 */   public LlmRequestFailed(@NotNull SerializableThrowable exception, @NotNull UUID id) { this.exception = exception; this.id = id; } @NotNull public final SerializableThrowable getException() { return this.exception; } @NotNull public final UUID getId() { return this.id; }
/*    */   
/* 41 */   public LlmRequestFailed(@NotNull Exception exception, @NotNull UUID id) { this(new SerializableThrowable(exception, true), id); }
/*    */   @NotNull
/* 43 */   public String getGroupKey() { return "llm"; } @NotNull
/*    */   public EventType getType() {
/* 45 */     return EventType.End;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SerializableThrowable component1() {
/*    */     return this.exception;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final UUID component2() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LlmRequestFailed copy(@NotNull SerializableThrowable exception, @NotNull UUID id) {
/*    */     Intrinsics.checkNotNullParameter(exception, "exception");
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     return new LlmRequestFailed(exception, id);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LlmRequestFailed(exception=" + this.exception + ", id=" + this.id + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.exception.hashCode();
/*    */     return result * 31 + this.id.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LlmRequestFailed))
/*    */       return false; 
/*    */     LlmRequestFailed llmRequestFailed = (LlmRequestFailed)other;
/*    */     return !Intrinsics.areEqual(this.exception, llmRequestFailed.exception) ? false : (!!Intrinsics.areEqual(this.id, llmRequestFailed.id));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\LlmRequestFailed.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
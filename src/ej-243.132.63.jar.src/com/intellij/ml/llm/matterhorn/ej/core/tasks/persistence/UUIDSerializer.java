/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;
/*    */ import java.util.UUID;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\030\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\002H\026J\020\020\016\032\0020\0022\006\020\017\032\0020\020H\026R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\b¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/UUIDSerializer;", "Lkotlinx/serialization/KSerializer;", "Ljava/util/UUID;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ej-core"})
/*    */ public final class UUIDSerializer implements KSerializer<UUID> {
/*    */   @NotNull
/* 12 */   public static final UUIDSerializer INSTANCE = new UUIDSerializer(); @NotNull private static final SerialDescriptor descriptor = SerialDescriptorsKt.PrimitiveSerialDescriptor("UUID", (PrimitiveKind)PrimitiveKind.STRING.INSTANCE); @NotNull public SerialDescriptor getDescriptor() { return descriptor; }
/*    */   
/*    */   public void serialize(@NotNull Encoder encoder, @NotNull UUID value) {
/* 15 */     Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); Intrinsics.checkNotNullExpressionValue(value.toString(), "toString(...)"); encoder.encodeString(value.toString());
/*    */   }
/*    */   @NotNull
/*    */   public UUID deserialize(@NotNull Decoder decoder) {
/* 19 */     Intrinsics.checkNotNullParameter(decoder, "decoder"); Intrinsics.checkNotNullExpressionValue(UUID.fromString(decoder.decodeString()), "fromString(...)"); return UUID.fromString(decoder.decodeString());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\UUIDSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;
/*    */ 
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.Paths;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.PrimitiveKind;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptorsKt;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\030\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\002H\026J\020\020\016\032\0020\0022\006\020\017\032\0020\020H\026R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\b¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PathSerializer;", "Lkotlinx/serialization/KSerializer;", "Ljava/nio/file/Path;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ej-core"})
/*    */ public final class PathSerializer
/*    */   implements KSerializer<Path>
/*    */ {
/*    */   @NotNull
/*    */   public SerialDescriptor getDescriptor() {
/* 46 */     return descriptor; } @NotNull
/* 47 */   public static final PathSerializer INSTANCE = new PathSerializer(); @NotNull private static final SerialDescriptor descriptor = SerialDescriptorsKt.PrimitiveSerialDescriptor("Path", (PrimitiveKind)PrimitiveKind.STRING.INSTANCE);
/*    */   
/*    */   public void serialize(@NotNull Encoder encoder, @NotNull Path value) {
/* 50 */     Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); encoder.encodeString(value.toString());
/*    */   }
/*    */   @NotNull
/*    */   public Path deserialize(@NotNull Decoder decoder) {
/* 54 */     Intrinsics.checkNotNullParameter(decoder, "decoder"); Intrinsics.checkNotNullExpressionValue(Paths.get(decoder.decodeString(), new String[0]), "get(...)"); return Paths.get(decoder.decodeString(), new String[0]);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\PathSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
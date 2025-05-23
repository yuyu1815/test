/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;
/*    */ 
/*    */ import java.nio.file.Path;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\016\022\n\022\b\022\004\022\0020\0030\0020\001B\t\b\002¢\006\004\b\004\020\005J\027\020\006\032\b\022\004\022\0020\0030\0022\006\020\007\032\0020\bH\001J\037\020\t\032\0020\n2\006\020\013\032\0020\f2\f\020\r\032\b\022\004\022\0020\0030\002H\001R\022\020\016\032\0020\017X\005¢\006\006\032\004\b\020\020\021¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PathListSerializer;", "Lkotlinx/serialization/KSerializer;", "", "Ljava/nio/file/Path;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ej-core"})
/*    */ public final class PathListSerializer implements KSerializer<List<? extends Path>> {
/*    */   @NotNull
/*    */   public static final PathListSerializer INSTANCE = new PathListSerializer();
/*    */   
/*    */   @NotNull
/*    */   public SerialDescriptor getDescriptor() {
/*    */     return this.$$delegate_0.getDescriptor();
/*    */   }
/*    */   
/*    */   public void serialize(@NotNull Encoder encoder, @NotNull List value) {
/*    */     Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */     Intrinsics.checkNotNullParameter(value, "value");
/*    */     this.$$delegate_0.serialize(encoder, value);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public List<Path> deserialize(@NotNull Decoder decoder) {
/*    */     Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */     return (List<Path>)this.$$delegate_0.deserialize(decoder);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\PathListSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
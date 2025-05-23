/*    */ package ai.grazie.utils.attributes;
/*    */ 
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.LinkedHashMapSerializer;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020$\n\002\020\016\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\030\0002\b\022\004\022\0020\0020\001B\005¢\006\002\020\003J\020\020\013\032\0020\0022\006\020\f\032\0020\rH\026J\030\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\002H\026R \020\004\032\024\022\020\022\016\022\004\022\0020\006\022\004\022\0020\0060\0050\001X\004¢\006\002\n\000R\024\020\007\032\0020\b8VX\004¢\006\006\032\004\b\t\020\n¨\006\023"}, d2 = {"Lai/grazie/utils/attributes/StringProperties$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/attributes/StringProperties;", "()V", "delegate", "", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"})
/*    */ public final class Serializer
/*    */   implements KSerializer<StringProperties>
/*    */ {
/*    */   @NotNull
/* 21 */   private final KSerializer<Map<String, String>> delegate = (KSerializer<Map<String, String>>)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)StringSerializer.INSTANCE);
/*    */   @NotNull
/*    */   public StringProperties deserialize(@NotNull Decoder decoder) {
/* 24 */     Intrinsics.checkNotNullParameter(decoder, "decoder"); return new StringProperties((Map)this.delegate.deserialize(decoder), null);
/*    */   }
/*    */   @NotNull
/*    */   public SerialDescriptor getDescriptor() {
/* 28 */     return this.delegate.getDescriptor();
/*    */   }
/*    */   public void serialize(@NotNull Encoder encoder, @NotNull StringProperties value) {
/* 31 */     Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); this.delegate.serialize(encoder, value.getMap());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\StringProperties$Serializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
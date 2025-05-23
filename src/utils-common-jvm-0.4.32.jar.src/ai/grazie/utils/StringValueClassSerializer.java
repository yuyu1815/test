/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b&\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002BS\022\006\020\003\032\0020\004\022!\020\005\032\035\022\023\022\0210\004¢\006\f\b\007\022\b\b\003\022\004\b\b(\b\022\004\022\0028\0000\006\022!\020\t\032\035\022\023\022\0218\000¢\006\f\b\007\022\b\b\003\022\004\b\b(\b\022\004\022\0020\0040\006¢\006\002\020\nJ\025\020\024\032\0028\0002\006\020\025\032\0020\026H\026¢\006\002\020\027J\035\020\030\032\0020\0312\006\020\032\032\0020\0332\006\020\b\032\0028\000H\026¢\006\002\020\034R\024\020\013\032\0020\f8VX\004¢\006\006\032\004\b\r\020\016R,\020\005\032\035\022\023\022\0210\004¢\006\f\b\007\022\b\b\003\022\004\b\b(\b\022\004\022\0028\0000\006¢\006\b\n\000\032\004\b\017\020\020R,\020\t\032\035\022\023\022\0218\000¢\006\f\b\007\022\b\b\003\022\004\b\b(\b\022\004\022\0020\0040\006¢\006\b\n\000\032\004\b\021\020\020R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\022\020\023¨\006\035"}, d2 = {"Lai/grazie/utils/StringValueClassSerializer;", "T", "Lkotlinx/serialization/KSerializer;", "name", "", "factory", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "value", "getter", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getFactory", "()Lkotlin/jvm/functions/Function1;", "getGetter", "getName", "()Ljava/lang/String;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "utils-common"})
/*    */ public abstract class StringValueClassSerializer<T> implements KSerializer<T> {
/*    */   @NotNull
/*    */   private final String name;
/*    */   
/* 12 */   public StringValueClassSerializer(@NotNull String name, @NotNull Function1<String, T> factory, @NotNull Function1<T, String> getter) { this.name = name; this.factory = factory; this.getter = getter; } @NotNull private final Function1<String, T> factory; @NotNull private final Function1<T, String> getter; @NotNull public final String getName() { return this.name; } @NotNull public final Function1<String, T> getFactory() { return this.factory; } @NotNull public final Function1<T, String> getGetter() { return this.getter; } public T deserialize(@NotNull Decoder decoder) {
/* 13 */     Intrinsics.checkNotNullParameter(decoder, "decoder"); return (T)this.factory.invoke(decoder.decodeString());
/*    */   } @NotNull
/*    */   public SerialDescriptor getDescriptor() {
/* 16 */     return SerialDescriptorsKt.PrimitiveSerialDescriptor(this.name, (PrimitiveKind)PrimitiveKind.STRING.INSTANCE);
/*    */   }
/*    */   public void serialize(@NotNull Encoder encoder, Object value) {
/* 19 */     Intrinsics.checkNotNullParameter(encoder, "encoder"); encoder.encodeString((String)this.getter.invoke(value));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\StringValueClassSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
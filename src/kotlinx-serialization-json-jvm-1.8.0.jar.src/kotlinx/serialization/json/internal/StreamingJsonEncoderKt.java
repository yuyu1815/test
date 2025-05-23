/*    */ package kotlinx.serialization.json.internal;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.UByte;
/*    */ import kotlin.UShort;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.json.JsonElementKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\020\"\n\002\030\002\n\000\n\002\020\013\n\002\b\003\"\024\020\000\032\b\022\004\022\0020\0020\001X\004¢\006\002\n\000\"\030\020\003\032\0020\004*\0020\0028@X\004¢\006\006\032\004\b\003\020\005\"\030\020\006\032\0020\004*\0020\0028@X\004¢\006\006\032\004\b\006\020\005¨\006\007"}, d2 = {"unsignedNumberDescriptors", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "isUnsignedNumber", "", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "isUnquotedLiteral", "kotlinx-serialization-json"})
/*    */ public final class StreamingJsonEncoderKt {
/*    */   static {
/* 15 */     SerialDescriptor[] arrayOfSerialDescriptor = new SerialDescriptor[4]; arrayOfSerialDescriptor[0] = BuiltinSerializersKt.serializer(UInt.Companion).getDescriptor(); arrayOfSerialDescriptor[1] = 
/* 16 */       BuiltinSerializersKt.serializer(ULong.Companion).getDescriptor();
/* 17 */     arrayOfSerialDescriptor[2] = BuiltinSerializersKt.serializer(UByte.Companion).getDescriptor();
/* 18 */     arrayOfSerialDescriptor[3] = BuiltinSerializersKt.serializer(UShort.Companion).getDescriptor();
/*    */     unsignedNumberDescriptors = SetsKt.setOf((Object[])arrayOfSerialDescriptor);
/*    */   } @NotNull
/*    */   private static final Set<SerialDescriptor> unsignedNumberDescriptors; public static final boolean isUnsignedNumber(@NotNull SerialDescriptor $this$isUnsignedNumber) {
/* 22 */     Intrinsics.checkNotNullParameter($this$isUnsignedNumber, "<this>"); return ($this$isUnsignedNumber.isInline() && unsignedNumberDescriptors.contains($this$isUnsignedNumber));
/*    */   }
/*    */   public static final boolean isUnquotedLiteral(@NotNull SerialDescriptor $this$isUnquotedLiteral) {
/* 25 */     Intrinsics.checkNotNullParameter($this$isUnquotedLiteral, "<this>"); return ($this$isUnquotedLiteral.isInline() && Intrinsics.areEqual($this$isUnquotedLiteral, JsonElementKt.getJsonUnquotedLiteralDescriptor()));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\StreamingJsonEncoderKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
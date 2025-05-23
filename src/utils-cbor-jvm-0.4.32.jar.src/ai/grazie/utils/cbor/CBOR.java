/*    */ package ai.grazie.utils.cbor;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\004\n\002\020\022\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\b&\030\000 \0222\0020\001:\002\022\023B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\"\020\007\032\0020\b\"\n\b\000\020\t\030\001*\0020\0012\006\020\n\032\002H\tH\b¢\006\002\020\013J+\020\007\032\0020\b\"\b\b\000\020\t*\0020\0012\f\020\f\032\b\022\004\022\002H\t0\r2\006\020\n\032\002H\t¢\006\002\020\016J'\020\017\032\002H\t\"\004\b\000\020\t2\f\020\f\032\b\022\004\022\002H\t0\0202\006\020\n\032\0020\b¢\006\002\020\021R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\024"}, d2 = {"Lai/grazie/utils/cbor/CBOR;", "", "cbor", "Lkotlinx/serialization/cbor/Cbor;", "(Lkotlinx/serialization/cbor/Cbor;)V", "getCbor", "()Lkotlinx/serialization/cbor/Cbor;", "bytes", "", "T", "value", "(Ljava/lang/Object;)[B", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)[B", "parse", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/DeserializationStrategy;[B)Ljava/lang/Object;", "Companion", "Default", "utils-cbor"})
/*    */ public abstract class CBOR { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*  6 */   public CBOR(@NotNull Cbor cbor) { this.cbor = cbor; } @NotNull private final Cbor cbor; @NotNull public final Cbor getCbor() { return this.cbor; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lai/grazie/utils/cbor/CBOR$Companion;", "", "()V", "utils-cbor"}) public static final class Companion {
/*    */     private Companion() {} } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lai/grazie/utils/cbor/CBOR$Default;", "Lai/grazie/utils/cbor/CBOR;", "()V", "utils-cbor"})
/*    */   public static final class Default extends CBOR { @NotNull
/*  9 */     public static final Default INSTANCE = new Default(); private Default() { super(CborKt.Cbor$default(null, null.INSTANCE, 1, null)); }
/*    */      }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final <T> byte[] bytes(@NotNull SerializationStrategy serializer, @NotNull Object value) {
/* 15 */     Intrinsics.checkNotNullParameter(serializer, "serializer"); Intrinsics.checkNotNullParameter(value, "value"); return this.cbor.encodeToByteArray(serializer, value);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final <T> T parse(@NotNull DeserializationStrategy serializer, @NotNull byte[] value) {
/* 23 */     Intrinsics.checkNotNullParameter(serializer, "serializer"); Intrinsics.checkNotNullParameter(value, "value"); return (T)this.cbor.decodeFromByteArray(serializer, value);
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-cbor-jvm-0.4.32.jar!\ai\grazi\\utils\cbor\CBOR.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
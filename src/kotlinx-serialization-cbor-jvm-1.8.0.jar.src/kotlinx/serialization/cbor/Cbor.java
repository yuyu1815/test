/*    */ package kotlinx.serialization.cbor;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.BinaryFormat;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.ExperimentalSerializationApi;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.cbor.internal.ByteArrayInput;
/*    */ import kotlinx.serialization.cbor.internal.ByteArrayOutput;
/*    */ import kotlinx.serialization.cbor.internal.CborParser;
/*    */ import kotlinx.serialization.cbor.internal.CborReader;
/*    */ import kotlinx.serialization.cbor.internal.CborWriter;
/*    */ import kotlinx.serialization.cbor.internal.DefiniteLengthCborWriter;
/*    */ import kotlinx.serialization.cbor.internal.IndefiniteLengthCborWriter;
/*    */ import kotlinx.serialization.modules.SerializersModule;
/*    */ import kotlinx.serialization.modules.SerializersModuleBuildersKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @ExperimentalSerializationApi
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\022\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b7\030\000 \0302\0020\001:\001\030B\031\b\004\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J)\020\f\032\0020\r\"\004\b\000\020\0162\f\020\017\032\b\022\004\022\002H\0160\0202\006\020\021\032\002H\016H\026¢\006\002\020\022J)\020\023\032\002H\016\"\004\b\000\020\0162\f\020\024\032\b\022\004\022\002H\0160\0252\006\020\026\032\0020\rH\026¢\006\002\020\027R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\n\020\013\001\002\031\032¨\006\033"}, d2 = {"Lkotlinx/serialization/cbor/Cbor;", "Lkotlinx/serialization/BinaryFormat;", "configuration", "Lkotlinx/serialization/cbor/CborConfiguration;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "<init>", "(Lkotlinx/serialization/cbor/CborConfiguration;Lkotlinx/serialization/modules/SerializersModule;)V", "getConfiguration", "()Lkotlinx/serialization/cbor/CborConfiguration;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "encodeToByteArray", "", "T", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)[B", "decodeFromByteArray", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "bytes", "(Lkotlinx/serialization/DeserializationStrategy;[B)Ljava/lang/Object;", "Default", "Lkotlinx/serialization/cbor/Cbor$Default;", "Lkotlinx/serialization/cbor/CborImpl;", "kotlinx-serialization-cbor"})
/*    */ public abstract class Cbor implements BinaryFormat {
/* 25 */   private Cbor(CborConfiguration configuration, SerializersModule serializersModule) { this.configuration = configuration;
/* 26 */     this.serializersModule = serializersModule; } @NotNull public SerializersModule getSerializersModule() { return this.serializersModule; }
/*    */    @NotNull
/*    */   public final CborConfiguration getConfiguration() {
/*    */     return this.configuration;
/*    */   }
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\006\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\001¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lkotlinx/serialization/cbor/Cbor$Default;", "Lkotlinx/serialization/cbor/Cbor;", "<init>", "()V", "CoseCompliant", "getCoseCompliant", "()Lkotlinx/serialization/cbor/Cbor;", "kotlinx-serialization-cbor"})
/*    */   public static final class Default extends Cbor { private Default() {
/* 33 */       super(
/* 34 */           new CborConfiguration(
/* 35 */             false, 
/* 36 */             false, 
/* 37 */             false, 
/* 38 */             false, 
/* 39 */             false, 
/* 40 */             false, 
/* 41 */             false, 
/* 42 */             false, 
/* 43 */             false, 
/* 44 */             false, 
/* 45 */             false), 
/* 46 */           SerializersModuleBuildersKt.EmptySerializersModule(), null);
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final Cbor getCoseCompliant()
/*    */     {
/* 54 */       return Cbor.CoseCompliant; } } @NotNull
/* 55 */   public static final Default Default = new Default(null); @NotNull private final CborConfiguration configuration; @NotNull private static final Cbor CoseCompliant = CborKt.Cbor$default(null, Cbor::CoseCompliant$lambda$0, 1, null); @NotNull
/* 56 */   private final SerializersModule serializersModule; private static final Unit CoseCompliant$lambda$0(CborBuilder $this$Cbor) { Intrinsics.checkNotNullParameter($this$Cbor, "$this$Cbor"); $this$Cbor.setEncodeDefaults(false);
/* 57 */     $this$Cbor.setIgnoreUnknownKeys(false);
/* 58 */     $this$Cbor.setEncodeKeyTags(true);
/* 59 */     $this$Cbor.setEncodeValueTags(true);
/* 60 */     $this$Cbor.setEncodeObjectTags(true);
/* 61 */     $this$Cbor.setVerifyKeyTags(true);
/* 62 */     $this$Cbor.setVerifyValueTags(true);
/* 63 */     $this$Cbor.setVerifyObjectTags(true);
/* 64 */     $this$Cbor.setUseDefiniteLengthEncoding(true);
/* 65 */     $this$Cbor.setPreferCborLabelsOverNames(true);
/* 66 */     $this$Cbor.setAlwaysUseByteString(false);
/* 67 */     $this$Cbor.setSerializersModule(SerializersModuleBuildersKt.EmptySerializersModule());
/* 68 */     return Unit.INSTANCE; }
/*    */   
/*    */   @NotNull
/*    */   public <T> byte[] encodeToByteArray(@NotNull SerializationStrategy serializer, Object value) {
/* 72 */     Intrinsics.checkNotNullParameter(serializer, "serializer"); ByteArrayOutput output = new ByteArrayOutput();
/* 73 */     CborWriter dumper = this.configuration.getUseDefiniteLengthEncoding() ? (CborWriter)new DefiniteLengthCborWriter(
/* 74 */         this, 
/* 75 */         output) : 
/* 76 */       (CborWriter)new IndefiniteLengthCborWriter(
/* 77 */         this, 
/* 78 */         output);
/*    */     
/* 80 */     dumper.encodeSerializableValue(serializer, value);
/*    */     
/* 82 */     return output.toByteArray();
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> T decodeFromByteArray(@NotNull DeserializationStrategy deserializer, @NotNull byte[] bytes) {
/* 87 */     Intrinsics.checkNotNullParameter(deserializer, "deserializer"); Intrinsics.checkNotNullParameter(bytes, "bytes"); ByteArrayInput stream = new ByteArrayInput(bytes);
/* 88 */     CborReader reader = new CborReader(this, new CborParser(stream, this.configuration.getVerifyObjectTags()));
/* 89 */     return (T)reader.decodeSerializableValue(deserializer);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\Cbor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
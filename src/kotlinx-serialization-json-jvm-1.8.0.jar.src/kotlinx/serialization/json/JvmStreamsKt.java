/*     */ package kotlinx.serialization.json;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.MagicApiIntrinsics;
/*     */ import kotlin.sequences.Sequence;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.ExperimentalSerializationApi;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.SerializersKt;
/*     */ import kotlinx.serialization.json.internal.InternalJsonReader;
/*     */ import kotlinx.serialization.json.internal.InternalJsonWriter;
/*     */ import kotlinx.serialization.json.internal.JavaStreamSerialReader;
/*     */ import kotlinx.serialization.json.internal.JsonStreamsKt;
/*     */ import kotlinx.serialization.json.internal.JsonToJavaStreamWriter;
/*     */ import kotlinx.serialization.modules.SerializersModule;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0006\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\0325\020\000\032\0020\001\"\004\b\000\020\002*\0020\0032\f\020\004\032\b\022\004\022\002H\0020\0052\006\020\006\032\002H\0022\006\020\007\032\0020\bH\007¢\006\002\020\t\032*\020\000\032\0020\001\"\006\b\000\020\002\030\001*\0020\0032\006\020\006\032\002H\0022\006\020\007\032\0020\bH\b¢\006\002\020\n\032-\020\013\032\002H\002\"\004\b\000\020\002*\0020\0032\f\020\f\032\b\022\004\022\002H\0020\r2\006\020\007\032\0020\016H\007¢\006\002\020\017\032\"\020\013\032\002H\002\"\006\b\000\020\002\030\001*\0020\0032\006\020\007\032\0020\016H\b¢\006\002\020\020\0328\020\021\032\b\022\004\022\002H\0020\022\"\004\b\000\020\002*\0020\0032\006\020\007\032\0020\0162\f\020\f\032\b\022\004\022\002H\0020\r2\b\b\002\020\023\032\0020\024H\007\032-\020\021\032\b\022\004\022\002H\0020\022\"\006\b\000\020\002\030\001*\0020\0032\006\020\007\032\0020\0162\b\b\002\020\023\032\0020\024H\b¨\006\025"}, d2 = {"encodeToStream", "", "T", "Lkotlinx/serialization/json/Json;", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "stream", "Ljava/io/OutputStream;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Ljava/io/OutputStream;)V", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;Ljava/io/OutputStream;)V", "decodeFromStream", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "Ljava/io/InputStream;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Ljava/io/InputStream;)Ljava/lang/Object;", "(Lkotlinx/serialization/json/Json;Ljava/io/InputStream;)Ljava/lang/Object;", "decodeToSequence", "Lkotlin/sequences/Sequence;", "format", "Lkotlinx/serialization/json/DecodeSequenceMode;", "kotlinx-serialization-json"})
/*     */ public final class JvmStreamsKt {
/*     */   @ExperimentalSerializationApi
/*     */   public static final <T> void encodeToStream(@NotNull Json $this$encodeToStream, @NotNull SerializationStrategy serializer, Object value, @NotNull OutputStream stream) {
/*  23 */     Intrinsics.checkNotNullParameter($this$encodeToStream, "<this>"); Intrinsics.checkNotNullParameter(serializer, "serializer"); Intrinsics.checkNotNullParameter(stream, "stream"); JsonToJavaStreamWriter writer = new JsonToJavaStreamWriter(stream);
/*     */     try {
/*  25 */       JsonStreamsKt.encodeByWriter($this$encodeToStream, (InternalJsonWriter)writer, serializer, value);
/*     */     } finally {
/*  27 */       writer.release();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ExperimentalSerializationApi
/*     */   public static final <T> T decodeFromStream(@NotNull Json $this$decodeFromStream, @NotNull DeserializationStrategy deserializer, @NotNull InputStream stream) {
/*  59 */     Intrinsics.checkNotNullParameter($this$decodeFromStream, "<this>"); Intrinsics.checkNotNullParameter(deserializer, "deserializer"); Intrinsics.checkNotNullParameter(stream, "stream"); JavaStreamSerialReader reader = new JavaStreamSerialReader(stream);
/*     */     try {
/*  61 */       return (T)JsonStreamsKt.decodeByReader($this$decodeFromStream, deserializer, (InternalJsonReader)reader);
/*     */     } finally {
/*  63 */       reader.release();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ExperimentalSerializationApi
/*     */   @NotNull
/*     */   public static final <T> Sequence<T> decodeToSequence(@NotNull Json $this$decodeToSequence, @NotNull InputStream stream, @NotNull DeserializationStrategy deserializer, @NotNull DecodeSequenceMode format) {
/* 105 */     Intrinsics.checkNotNullParameter($this$decodeToSequence, "<this>"); Intrinsics.checkNotNullParameter(stream, "stream"); Intrinsics.checkNotNullParameter(deserializer, "deserializer"); Intrinsics.checkNotNullParameter(format, "format"); return JsonStreamsKt.decodeToSequenceByReader($this$decodeToSequence, (InternalJsonReader)new JavaStreamSerialReader(stream), deserializer, format);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JvmStreamsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
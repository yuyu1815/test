/*     */ package kotlinx.serialization.json.io;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.MagicApiIntrinsics;
/*     */ import kotlin.sequences.Sequence;
/*     */ import kotlinx.io.Sink;
/*     */ import kotlinx.io.Source;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.ExperimentalSerializationApi;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.SerializersKt;
/*     */ import kotlinx.serialization.json.DecodeSequenceMode;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.internal.InternalJsonReader;
/*     */ import kotlinx.serialization.json.internal.InternalJsonWriter;
/*     */ import kotlinx.serialization.json.internal.JsonStreamsKt;
/*     */ import kotlinx.serialization.json.io.internal.IoSerialReader;
/*     */ import kotlinx.serialization.json.io.internal.JsonToIoStreamWriter;
/*     */ import kotlinx.serialization.modules.SerializersModule;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0008\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\0325\020\000\032\0020\001\"\004\b\000\020\002*\0020\0032\f\020\004\032\b\022\004\022\002H\0020\0052\006\020\006\032\002H\0022\006\020\007\032\0020\bH\007¢\006\002\020\t\032*\020\000\032\0020\001\"\006\b\000\020\002\030\001*\0020\0032\006\020\006\032\002H\0022\006\020\007\032\0020\bH\b¢\006\002\020\n\032-\020\013\032\002H\002\"\004\b\000\020\002*\0020\0032\f\020\f\032\b\022\004\022\002H\0020\r2\006\020\016\032\0020\017H\007¢\006\002\020\020\032\"\020\013\032\002H\002\"\006\b\000\020\002\030\001*\0020\0032\006\020\016\032\0020\017H\b¢\006\002\020\021\0328\020\022\032\b\022\004\022\002H\0020\023\"\004\b\000\020\002*\0020\0032\006\020\016\032\0020\0172\f\020\f\032\b\022\004\022\002H\0020\r2\b\b\002\020\024\032\0020\025H\007\032-\020\022\032\b\022\004\022\002H\0020\023\"\006\b\000\020\002\030\001*\0020\0032\006\020\016\032\0020\0172\b\b\002\020\024\032\0020\025H\b¨\006\026"}, d2 = {"encodeToSink", "", "T", "Lkotlinx/serialization/json/Json;", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "sink", "Lkotlinx/io/Sink;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Lkotlinx/io/Sink;)V", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;Lkotlinx/io/Sink;)V", "decodeFromSource", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "source", "Lkotlinx/io/Source;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/io/Source;)Ljava/lang/Object;", "(Lkotlinx/serialization/json/Json;Lkotlinx/io/Source;)Ljava/lang/Object;", "decodeSourceToSequence", "Lkotlin/sequences/Sequence;", "format", "Lkotlinx/serialization/json/DecodeSequenceMode;", "kotlinx-serialization-json-io"})
/*     */ public final class IoStreamsKt
/*     */ {
/*     */   @ExperimentalSerializationApi
/*     */   public static final <T> void encodeToSink(@NotNull Json $this$encodeToSink, @NotNull SerializationStrategy serializer, Object value, @NotNull Sink sink) {
/*  28 */     Intrinsics.checkNotNullParameter($this$encodeToSink, "<this>"); Intrinsics.checkNotNullParameter(serializer, "serializer"); Intrinsics.checkNotNullParameter(sink, "sink"); JsonToIoStreamWriter writer = new JsonToIoStreamWriter(sink);
/*     */     try {
/*  30 */       JsonStreamsKt.encodeByWriter($this$encodeToSink, (InternalJsonWriter)writer, serializer, value);
/*     */     } finally {
/*  32 */       writer.release();
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
/*     */   @ExperimentalSerializationApi
/*     */   public static final <T> T decodeFromSource(@NotNull Json $this$decodeFromSource, @NotNull DeserializationStrategy deserializer, @NotNull Source source) {
/*  63 */     Intrinsics.checkNotNullParameter($this$decodeFromSource, "<this>"); Intrinsics.checkNotNullParameter(deserializer, "deserializer"); Intrinsics.checkNotNullParameter(source, "source"); return (T)JsonStreamsKt.decodeByReader($this$decodeFromSource, deserializer, (InternalJsonReader)new IoSerialReader(source));
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
/*     */   @ExperimentalSerializationApi
/*     */   @NotNull
/*     */   public static final <T> Sequence<T> decodeSourceToSequence(@NotNull Json $this$decodeSourceToSequence, @NotNull Source source, @NotNull DeserializationStrategy deserializer, @NotNull DecodeSequenceMode format) {
/* 102 */     Intrinsics.checkNotNullParameter($this$decodeSourceToSequence, "<this>"); Intrinsics.checkNotNullParameter(source, "source"); Intrinsics.checkNotNullParameter(deserializer, "deserializer"); Intrinsics.checkNotNullParameter(format, "format"); return JsonStreamsKt.decodeToSequenceByReader($this$decodeSourceToSequence, (InternalJsonReader)new IoSerialReader(source), deserializer, format);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-io-jvm-1.8.0.jar!\kotlinx\serialization\json\io\IoStreamsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
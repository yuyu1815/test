/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.MagicApiIntrinsics;
/*     */ import kotlin.sequences.Sequence;
/*     */ import kotlin.sequences.SequencesKt;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.ExperimentalSerializationApi;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.SerializersKt;
/*     */ import kotlinx.serialization.json.DecodeSequenceMode;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.modules.SerializersModule;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000@\n\000\n\002\020\b\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\0329\020\004\032\0020\005\"\004\b\000\020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\f\020\013\032\b\022\004\022\002H\0060\f2\006\020\r\032\002H\006H\007¢\006\002\020\016\0321\020\017\032\002H\006\"\004\b\000\020\0062\006\020\007\032\0020\b2\f\020\020\032\b\022\004\022\002H\0060\0212\006\020\022\032\0020\023H\007¢\006\002\020\024\032<\020\025\032\b\022\004\022\002H\0060\026\"\004\b\000\020\0062\006\020\007\032\0020\b2\006\020\022\032\0020\0232\f\020\020\032\b\022\004\022\002H\0060\0212\b\b\002\020\027\032\0020\030H\007\0321\020\025\032\b\022\004\022\002H\0060\026\"\006\b\000\020\006\030\0012\006\020\007\032\0020\b2\006\020\022\032\0020\0232\b\b\002\020\027\032\0020\030H\b\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000¨\006\031"}, d2 = {"SINGLE_CHAR_MAX_CODEPOINT", "", "HIGH_SURROGATE_HEADER", "LOW_SURROGATE_HEADER", "encodeByWriter", "", "T", "json", "Lkotlinx/serialization/json/Json;", "writer", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/InternalJsonWriter;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "decodeByReader", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "reader", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/internal/InternalJsonReader;)Ljava/lang/Object;", "decodeToSequenceByReader", "Lkotlin/sequences/Sequence;", "format", "Lkotlinx/serialization/json/DecodeSequenceMode;", "kotlinx-serialization-json"})
/*     */ public final class JsonStreamsKt
/*     */ {
/*     */   private static final int SINGLE_CHAR_MAX_CODEPOINT = 65535;
/*     */   private static final int HIGH_SURROGATE_HEADER = 55232;
/*     */   private static final int LOW_SURROGATE_HEADER = 56320;
/*     */   
/*     */   @JsonFriendModuleApi
/*     */   public static final <T> void encodeByWriter(@NotNull Json json, @NotNull InternalJsonWriter writer, @NotNull SerializationStrategy<? super Object> serializer, Object value) {
/*  94 */     Intrinsics.checkNotNullParameter(json, "json"); Intrinsics.checkNotNullParameter(writer, "writer"); Intrinsics.checkNotNullParameter(serializer, "serializer"); StreamingJsonEncoder encoder = new StreamingJsonEncoder(
/*  95 */         writer, json, 
/*  96 */         WriteMode.OBJ, 
/*  97 */         new kotlinx.serialization.json.JsonEncoder[WriteMode.getEntries().size()]);
/*     */     
/*  99 */     encoder.encodeSerializableValue(serializer, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @JsonFriendModuleApi
/*     */   public static final <T> T decodeByReader(@NotNull Json json, @NotNull DeserializationStrategy<?> deserializer, @NotNull InternalJsonReader reader) {
/* 108 */     Intrinsics.checkNotNullParameter(json, "json"); Intrinsics.checkNotNullParameter(deserializer, "deserializer"); Intrinsics.checkNotNullParameter(reader, "reader"); ReaderJsonLexer lexer = ReaderJsonLexerKt.ReaderJsonLexer$default(json, reader, null, 4, null);
/*     */     try {
/* 110 */       StreamingJsonDecoder input = new StreamingJsonDecoder(json, WriteMode.OBJ, lexer, deserializer.getDescriptor(), null);
/* 111 */       Object result = input.decodeSerializableValue(deserializer);
/* 112 */       lexer.expectEof();
/* 113 */       return (T)result;
/*     */     } finally {
/* 115 */       lexer.release();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @JsonFriendModuleApi
/*     */   @ExperimentalSerializationApi
/*     */   @NotNull
/*     */   public static final <T> Sequence<T> decodeToSequenceByReader(@NotNull Json json, @NotNull InternalJsonReader reader, @NotNull DeserializationStrategy<?> deserializer, @NotNull DecodeSequenceMode format) {
/* 127 */     Intrinsics.checkNotNullParameter(json, "json"); Intrinsics.checkNotNullParameter(reader, "reader"); Intrinsics.checkNotNullParameter(deserializer, "deserializer"); Intrinsics.checkNotNullParameter(format, "format"); ReaderJsonLexer lexer = ReaderJsonLexerKt.ReaderJsonLexer(json, reader, new char[16384]);
/* 128 */     Iterator<?> iter = JsonIteratorKt.JsonIterator(format, json, lexer, deserializer);
/* 129 */     return SequencesKt.constrainOnce(new JsonStreamsKt$decodeToSequenceByReader$$inlined$Sequence$1(iter));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonStreamsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
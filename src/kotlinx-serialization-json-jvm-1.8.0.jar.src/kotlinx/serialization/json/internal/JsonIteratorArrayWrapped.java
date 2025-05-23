/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.markers.KMappedMarker;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.json.Json;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\000\n\002\020(\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\005\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B%\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\f\020\007\032\b\022\004\022\0028\0000\b¢\006\004\b\t\020\nJ\016\020\016\032\0028\000H\002¢\006\002\020\017J\t\020\020\032\0020\fH\002R\016\020\003\032\0020\004X\004¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000R\024\020\007\032\b\022\004\022\0028\0000\bX\004¢\006\002\n\000R\016\020\013\032\0020\fX\016¢\006\002\n\000R\016\020\r\032\0020\fX\016¢\006\002\n\000¨\006\021"}, d2 = {"Lkotlinx/serialization/json/internal/JsonIteratorArrayWrapped;", "T", "", "json", "Lkotlinx/serialization/json/Json;", "lexer", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/ReaderJsonLexer;Lkotlinx/serialization/DeserializationStrategy;)V", "first", "", "finished", "next", "()Ljava/lang/Object;", "hasNext", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nJsonIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonIterator.kt\nkotlinx/serialization/json/internal/JsonIteratorArrayWrapped\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 3 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer$fail$1\n*L\n1#1,103:1\n226#2,10:104\n229#3:114\n*S KotlinDebug\n*F\n+ 1 JsonIterator.kt\nkotlinx/serialization/json/internal/JsonIteratorArrayWrapped\n*L\n99#1:104,10\n99#1:114\n*E\n"})
/*     */ final class JsonIteratorArrayWrapped<T>
/*     */   implements Iterator<T>, KMappedMarker
/*     */ {
/*     */   @NotNull
/*     */   private final Json json;
/*     */   @NotNull
/*     */   private final ReaderJsonLexer lexer;
/*     */   @NotNull
/*     */   private final DeserializationStrategy<T> deserializer;
/*     */   private boolean first;
/*     */   private boolean finished;
/*     */   
/*     */   public JsonIteratorArrayWrapped(@NotNull Json json, @NotNull ReaderJsonLexer lexer, @NotNull DeserializationStrategy<T> deserializer) {
/*  66 */     this.json = json;
/*  67 */     this.lexer = lexer;
/*  68 */     this.deserializer = deserializer;
/*     */     
/*  70 */     this.first = true;
/*     */   }
/*     */   
/*     */   public T next() {
/*  74 */     if (this.first) {
/*  75 */       this.first = false;
/*     */     } else {
/*  77 */       this.lexer.consumeNextToken(',');
/*     */     } 
/*  79 */     StreamingJsonDecoder input = new StreamingJsonDecoder(this.json, WriteMode.OBJ, this.lexer, this.deserializer.getDescriptor(), null);
/*  80 */     return input.decodeSerializableValue(this.deserializer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasNext() {
/*  87 */     if (this.finished) return false; 
/*  88 */     if (this.lexer.peekNextToken() == 9) {
/*  89 */       this.finished = true;
/*  90 */       this.lexer.consumeNextToken((byte)9);
/*  91 */       if (this.lexer.isNotEof()) {
/*  92 */         if (this.lexer.peekNextToken() == 8) { AbstractJsonLexer.fail$default(this.lexer, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6, null); throw new KotlinNothingValueException(); }
/*     */ 
/*     */         
/*  95 */         this.lexer.expectEof();
/*     */       } 
/*  97 */       return false;
/*     */     } 
/*  99 */     if (!this.lexer.isNotEof() && !this.finished) { ReaderJsonLexer readerJsonLexer1 = this.lexer; byte expectedToken$iv = 9;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 106 */       boolean wasConsumed$iv = true;
/*     */       
/*     */       int $i$f$fail$kotlinx_serialization_json = 0;
/*     */       
/* 110 */       String expected$iv = AbstractJsonLexerKt.tokenDescription(expectedToken$iv);
/* 111 */       int position$iv = readerJsonLexer1.currentPosition - 1;
/* 112 */       String s$iv = (readerJsonLexer1.currentPosition == AbstractJsonLexer.access$getSource(readerJsonLexer1).length() || position$iv < 0) ? "EOF" : String.valueOf(AbstractJsonLexer.access$getSource(readerJsonLexer1).charAt(position$iv));
/* 113 */       String str1 = s$iv, str2 = expected$iv; ReaderJsonLexer readerJsonLexer2 = readerJsonLexer1; int $i$a$-fail$kotlinx_serialization_json-AbstractJsonLexer$fail$1 = 0; str1 = str1; String expected = str2; AbstractJsonLexer.fail$default(
/* 114 */           readerJsonLexer2, "Expected " + expected + ", but had '" + str1 + "' instead", position$iv, null, 4, null);
/*     */       throw new KotlinNothingValueException(); }
/*     */     
/*     */     return true;
/*     */   }
/*     */   
/*     */   public void remove() {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonIteratorArrayWrapped.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
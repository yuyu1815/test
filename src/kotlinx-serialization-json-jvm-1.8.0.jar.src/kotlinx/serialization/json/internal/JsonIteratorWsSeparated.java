/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.markers.KMappedMarker;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.json.Json;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\000\n\002\020(\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\013\n\000\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B%\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\f\020\007\032\b\022\004\022\0028\0000\b¢\006\004\b\t\020\nJ\016\020\013\032\0028\000H\002¢\006\002\020\fJ\t\020\r\032\0020\016H\002R\016\020\003\032\0020\004X\004¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000R\024\020\007\032\b\022\004\022\0028\0000\bX\004¢\006\002\n\000¨\006\017"}, d2 = {"Lkotlinx/serialization/json/internal/JsonIteratorWsSeparated;", "T", "", "json", "Lkotlinx/serialization/json/Json;", "lexer", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/ReaderJsonLexer;Lkotlinx/serialization/DeserializationStrategy;)V", "next", "()Ljava/lang/Object;", "hasNext", "", "kotlinx-serialization-json"})
/*    */ final class JsonIteratorWsSeparated<T>
/*    */   implements Iterator<T>, KMappedMarker
/*    */ {
/*    */   @NotNull
/*    */   private final Json json;
/*    */   @NotNull
/*    */   private final ReaderJsonLexer lexer;
/*    */   @NotNull
/*    */   private final DeserializationStrategy<T> deserializer;
/*    */   
/*    */   public JsonIteratorWsSeparated(@NotNull Json json, @NotNull ReaderJsonLexer lexer, @NotNull DeserializationStrategy<T> deserializer) {
/* 54 */     this.json = json;
/* 55 */     this.lexer = lexer;
/* 56 */     this.deserializer = deserializer;
/*    */   }
/*    */   
/*    */   public T next() {
/* 60 */     return (new StreamingJsonDecoder(this.json, WriteMode.OBJ, this.lexer, this.deserializer.getDescriptor(), null)).decodeSerializableValue(this.deserializer);
/*    */   } public boolean hasNext() {
/* 62 */     return this.lexer.isNotEof();
/*    */   }
/*    */   
/*    */   public void remove() {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonIteratorWsSeparated.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
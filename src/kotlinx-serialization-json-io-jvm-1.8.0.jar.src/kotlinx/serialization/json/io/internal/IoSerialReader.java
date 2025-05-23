/*    */ package kotlinx.serialization.json.io.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlinx.io.Source;
/*    */ import kotlinx.io.Utf8Kt;
/*    */ import kotlinx.serialization.json.internal.InternalJsonReaderCodePointImpl;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\b\n\000\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\b\020\006\032\0020\007H\026J\b\020\b\032\0020\tH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\n"}, d2 = {"Lkotlinx/serialization/json/io/internal/IoSerialReader;", "Lkotlinx/serialization/json/internal/InternalJsonReaderCodePointImpl;", "source", "Lkotlinx/io/Source;", "<init>", "(Lkotlinx/io/Source;)V", "exhausted", "", "nextCodePoint", "", "kotlinx-serialization-json-io"})
/*    */ public final class IoSerialReader
/*    */   extends InternalJsonReaderCodePointImpl
/*    */ {
/*    */   @NotNull
/*    */   private final Source source;
/*    */   
/*    */   public IoSerialReader(@NotNull Source source) {
/* 37 */     this.source = source;
/* 38 */   } public boolean exhausted() { return this.source.exhausted(); } public int nextCodePoint() {
/* 39 */     return Utf8Kt.readCodePointValue(this.source);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-io-jvm-1.8.0.jar!\kotlinx\serialization\json\io\internal\IoSerialReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
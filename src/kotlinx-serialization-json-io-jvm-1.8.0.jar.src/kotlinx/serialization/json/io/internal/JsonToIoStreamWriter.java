/*    */ package kotlinx.serialization.json.io.internal;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.io.Sink;
/*    */ import kotlinx.io.Utf8Kt;
/*    */ import kotlinx.serialization.json.internal.StringOpsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\t\n\002\b\002\n\002\020\f\n\002\b\002\n\002\020\016\n\002\b\003\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\006\032\0020\0072\006\020\b\032\0020\tH\026J\020\020\n\032\0020\0072\006\020\013\032\0020\fH\026J\020\020\r\032\0020\0072\006\020\016\032\0020\017H\026J\020\020\020\032\0020\0072\006\020\016\032\0020\017H\026J\b\020\021\032\0020\007H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\022"}, d2 = {"Lkotlinx/serialization/json/io/internal/JsonToIoStreamWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "sink", "Lkotlinx/io/Sink;", "<init>", "(Lkotlinx/io/Sink;)V", "writeLong", "", "value", "", "writeChar", "char", "", "write", "text", "", "writeQuoted", "release", "kotlinx-serialization-json-io"})
/*    */ @SourceDebugExtension({"SMAP\nIoJsonStreams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IoJsonStreams.kt\nkotlinx/serialization/json/io/internal/JsonToIoStreamWriter\n+ 2 JsonStreams.kt\nkotlinx/serialization/json/internal/InternalJsonWriter$Companion\n*L\n1#1,41:1\n20#2,12:42\n*S KotlinDebug\n*F\n+ 1 IoJsonStreams.kt\nkotlinx/serialization/json/io/internal/JsonToIoStreamWriter\n*L\n28#1:42,12\n*E\n"})
/*    */ public final class JsonToIoStreamWriter implements InternalJsonWriter {
/*    */   public JsonToIoStreamWriter(@NotNull Sink sink) {
/* 12 */     this.sink = sink;
/*    */   } @NotNull
/*    */   private final Sink sink; public void writeLong(long value) {
/* 15 */     write(String.valueOf(value));
/*    */   }
/*    */   
/*    */   public void writeChar(char char) {
/* 19 */     Utf8Kt.writeCodePointValue(this.sink, char);
/*    */   }
/*    */   
/*    */   public void write(@NotNull String text) {
/* 23 */     Intrinsics.checkNotNullParameter(text, "text"); Utf8Kt.writeString$default(this.sink, text, 0, 0, 6, null);
/*    */   }
/*    */   
/*    */   public void writeQuoted(@NotNull String text) {
/* 27 */     Intrinsics.checkNotNullParameter(text, "text"); Utf8Kt.writeCodePointValue(this.sink, 34);
/* 28 */     InternalJsonWriter.Companion this_$iv = InternalJsonWriter.Companion; int $i$f$doWriteEscaping = 0;
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
/* 42 */     int lastPos$iv = 0;
/* 43 */     for (int i$iv = 0, i = text.length(); i$iv < i; i$iv++) {
/* 44 */       int c$iv = text.charAt(i$iv);
/* 45 */       if (c$iv < (StringOpsKt.getESCAPE_STRINGS()).length && StringOpsKt.getESCAPE_STRINGS()[c$iv] != null) {
/* 46 */         int k = i$iv, m = lastPos$iv; String str2 = text; int n = 0; Utf8Kt.writeString(this.sink, str2, m, k);
/* 47 */         Intrinsics.checkNotNull(StringOpsKt.getESCAPE_STRINGS()[c$iv]); String escape$iv = StringOpsKt.getESCAPE_STRINGS()[c$iv];
/* 48 */         n = escape$iv.length(); int j = 0; String str1 = escape$iv; int i1 = 0;
/*    */       } 
/*    */       continue;
/*    */     } 
/* 52 */     int end = text.length(), start = lastPos$iv; String s = text; int $i$a$-doWriteEscaping-JsonToIoStreamWriter$writeQuoted$1 = 0;
/*    */     Utf8Kt.writeString(this.sink, s, start, end);
/*    */     Utf8Kt.writeCodePointValue(this.sink, 34);
/*    */   }
/*    */   
/*    */   public void release() {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-io-jvm-1.8.0.jar!\kotlinx\serialization\json\io\internal\JsonToIoStreamWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
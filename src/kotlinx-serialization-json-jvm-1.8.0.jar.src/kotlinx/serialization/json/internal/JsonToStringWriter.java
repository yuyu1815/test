/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.ranges.RangesKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\031\n\000\n\002\020\b\n\000\n\002\020\002\n\000\n\002\020\t\n\002\b\002\n\002\020\f\n\002\b\002\n\002\020\016\n\002\b\r\b\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\020\020\f\032\0020\t2\006\020\r\032\0020\016H\026J\020\020\017\032\0020\t2\006\020\020\032\0020\021H\026J\020\020\022\032\0020\t2\006\020\020\032\0020\021H\026J \020\023\032\0020\t2\006\020\024\032\0020\0072\006\020\025\032\0020\0072\006\020\026\032\0020\021H\002J\b\020\027\032\0020\tH\026J\b\020\030\032\0020\021H\026J\020\020\031\032\0020\t2\006\020\032\032\0020\007H\002J\030\020\033\032\0020\0072\006\020\034\032\0020\0072\006\020\035\032\0020\007H\002R\016\020\004\032\0020\005X\016¢\006\002\n\000R\016\020\006\032\0020\007X\016¢\006\002\n\000¨\006\036"}, d2 = {"Lkotlinx/serialization/json/internal/JsonToStringWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "<init>", "()V", "array", "", "size", "", "writeLong", "", "value", "", "writeChar", "char", "", "write", "text", "", "writeQuoted", "appendStringSlowPath", "firstEscapedChar", "currentSize", "string", "release", "toString", "ensureAdditionalCapacity", "expected", "ensureTotalCapacity", "oldSize", "additional", "kotlinx-serialization-json"})
/*     */ public final class JsonToStringWriter
/*     */   implements InternalJsonWriter
/*     */ {
/*     */   @NotNull
/*  29 */   private char[] array = CharArrayPool.INSTANCE.take();
/*     */   
/*     */   private int size;
/*     */   
/*     */   public void writeLong(long value) {
/*  34 */     write(String.valueOf(value));
/*     */   }
/*     */   
/*     */   public void writeChar(char char) {
/*  38 */     ensureAdditionalCapacity(1);
/*  39 */     int i = this.size; this.size = i + 1; this.array[i] = char;
/*     */   }
/*     */   
/*     */   public void write(@NotNull String text) {
/*  43 */     Intrinsics.checkNotNullParameter(text, "text"); int length = text.length();
/*  44 */     if (length == 0)
/*  45 */       return;  ensureAdditionalCapacity(length);
/*  46 */     String str = text; char[] arrayOfChar = this.array; int i = this.size; boolean bool = false; int j = text.length(); str.getChars(bool, j, arrayOfChar, i);
/*  47 */     this.size += length;
/*     */   }
/*     */   
/*     */   public void writeQuoted(@NotNull String text) {
/*  51 */     Intrinsics.checkNotNullParameter(text, "text"); ensureAdditionalCapacity(text.length() + 2);
/*  52 */     char[] arr = this.array;
/*  53 */     int sz = this.size;
/*  54 */     arr[sz++] = '"';
/*  55 */     int length = text.length();
/*  56 */     String str = text; int j = 0; str.getChars(j, length, arr, sz);
/*  57 */     for (int i = sz; i < j; i++) {
/*  58 */       int ch = arr[i];
/*     */       
/*  60 */       if (ch < (StringOpsKt.getESCAPE_MARKERS()).length && StringOpsKt.getESCAPE_MARKERS()[ch] != 0) {
/*     */         
/*  62 */         appendStringSlowPath(i - sz, i, text);
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/*  67 */     sz += length;
/*  68 */     arr[sz++] = '"';
/*  69 */     this.size = sz;
/*     */   }
/*     */   
/*     */   private final void appendStringSlowPath(int firstEscapedChar, int currentSize, String string) {
/*  73 */     int sz = currentSize;
/*  74 */     for (int i = firstEscapedChar, j = string.length(); i < j; i++) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  79 */       sz = ensureTotalCapacity(sz, 2);
/*  80 */       int ch = string.charAt(i);
/*     */       
/*  82 */       if (ch < (StringOpsKt.getESCAPE_MARKERS()).length) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  89 */         byte marker = StringOpsKt.getESCAPE_MARKERS()[ch];
/*  90 */         if (marker == 0) {
/*  91 */           this.array[sz++] = (char)ch;
/*     */         }
/*  93 */         else if (marker == 1) {
/*  94 */           Intrinsics.checkNotNull(StringOpsKt.getESCAPE_STRINGS()[ch]); String escapedString = StringOpsKt.getESCAPE_STRINGS()[ch];
/*  95 */           sz = ensureTotalCapacity(sz, escapedString.length());
/*  96 */           String str1 = escapedString; char[] arrayOfChar = this.array; boolean bool = false; int k = escapedString.length(); str1.getChars(bool, k, arrayOfChar, sz);
/*  97 */           sz += escapedString.length();
/*  98 */           this.size = sz;
/*     */         } else {
/*     */           
/* 101 */           this.array[sz] = '\\';
/* 102 */           this.array[sz + 1] = (char)marker;
/* 103 */           sz += 2;
/* 104 */           this.size = sz;
/*     */         } 
/*     */       } else {
/*     */         
/* 108 */         this.array[sz++] = (char)ch;
/*     */       } 
/*     */     } 
/* 111 */     sz = ensureTotalCapacity(sz, 1);
/* 112 */     this.array[sz++] = '"';
/* 113 */     this.size = sz;
/*     */   }
/*     */   
/*     */   public void release() {
/* 117 */     CharArrayPool.INSTANCE.release(this.array);
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 121 */     return new String(this.array, 0, this.size);
/*     */   }
/*     */   
/*     */   private final void ensureAdditionalCapacity(int expected) {
/* 125 */     ensureTotalCapacity(this.size, expected);
/*     */   }
/*     */ 
/*     */   
/*     */   private final int ensureTotalCapacity(int oldSize, int additional) {
/* 130 */     int newSize = oldSize + additional;
/* 131 */     if (this.array.length <= newSize) {
/* 132 */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.array, RangesKt.coerceAtLeast(newSize, oldSize * 2)), "copyOf(...)"); this.array = Arrays.copyOf(this.array, RangesKt.coerceAtLeast(newSize, oldSize * 2));
/*     */     } 
/* 134 */     return oldSize;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonToStringWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
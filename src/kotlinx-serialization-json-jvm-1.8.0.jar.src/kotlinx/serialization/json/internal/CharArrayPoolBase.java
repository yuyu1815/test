/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.ArrayDeque;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\020\031\n\000\n\002\020\b\n\002\b\003\n\002\020\002\n\002\b\002\b\020\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\t\032\0020\0062\006\020\n\032\0020\bH\004J\020\020\013\032\0020\f2\006\020\r\032\0020\006H\004R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000R\016\020\007\032\0020\bX\016¢\006\002\n\000¨\006\016"}, d2 = {"Lkotlinx/serialization/json/internal/CharArrayPoolBase;", "", "<init>", "()V", "arrays", "Lkotlin/collections/ArrayDeque;", "", "charsTotal", "", "take", "size", "releaseImpl", "", "array", "kotlinx-serialization-json"})
/*    */ @SourceDebugExtension({"SMAP\nArrayPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayPools.kt\nkotlinx/serialization/json/internal/CharArrayPoolBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/*    */ public class CharArrayPoolBase
/*    */ {
/*    */   @NotNull
/* 15 */   private final ArrayDeque<char[]> arrays = new ArrayDeque();
/*    */ 
/*    */   
/*    */   private int charsTotal;
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   protected final char[] take(int size) {
/* 23 */     synchronized (this) { int $i$a$-synchronized-CharArrayPoolBase$take$candidate$1 = 0;
/* 24 */       char[] arrayOfChar2 = (char[])this.arrays.removeLastOrNull(), it = arrayOfChar2;
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
/* 91 */       int $i$a$-also-CharArrayPoolBase$take$candidate$1$1 = 0;
/*    */       this.charsTotal -= it.length;
/*    */       (char[])this.arrays.removeLastOrNull();
/*    */       char[] arrayOfChar1 = ((char[])this.arrays.removeLastOrNull() != null) ? arrayOfChar2 : null; }
/*    */     
/*    */     char[] candidate = arrayOfChar1;
/*    */     if (candidate == null);
/*    */     return new char[size];
/*    */   }
/*    */   
/*    */   protected final void releaseImpl(@NotNull char[] array) {
/*    */     Intrinsics.checkNotNullParameter(array, "array");
/*    */     synchronized (this) {
/*    */       int $i$a$-synchronized-CharArrayPoolBase$releaseImpl$1 = 0;
/*    */       if (this.charsTotal + array.length < ArrayPoolsKt.access$getMAX_CHARS_IN_POOL$p()) {
/*    */         this.charsTotal += array.length;
/*    */         this.arrays.addLast(array);
/*    */       } 
/*    */       Unit unit = Unit.INSTANCE;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\CharArrayPoolBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
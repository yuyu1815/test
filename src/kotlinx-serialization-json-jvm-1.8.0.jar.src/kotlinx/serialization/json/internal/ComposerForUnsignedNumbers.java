/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.UByte;
/*    */ import kotlin.UInt;
/*    */ import kotlin.ULong;
/*    */ import kotlin.UShort;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\020\002\n\000\n\002\020\b\n\002\020\t\n\002\020\005\n\002\020\n\n\000\b\001\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\020\020\b\032\0020\t2\006\020\n\032\0020\fH\026J\020\020\b\032\0020\t2\006\020\n\032\0020\rH\026J\020\020\b\032\0020\t2\006\020\n\032\0020\016H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnsignedNumbers;", "Lkotlinx/serialization/json/internal/Composer;", "writer", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "forceQuoting", "", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Z)V", "print", "", "v", "", "", "", "", "kotlinx-serialization-json"})
/*    */ @SuppressAnimalSniffer
/*    */ public final class ComposerForUnsignedNumbers
/*    */   extends Composer
/*    */ {
/*    */   private final boolean forceQuoting;
/*    */   
/*    */   public ComposerForUnsignedNumbers(@NotNull InternalJsonWriter writer, boolean forceQuoting) {
/* 49 */     super(writer); this.forceQuoting = forceQuoting;
/*    */   } public void print(int v) {
/* 51 */     if (this.forceQuoting) { printQuoted(Integer.toUnsignedString(UInt.constructor-impl(v))); } else { print(Integer.toUnsignedString(UInt.constructor-impl(v))); }
/*    */   
/*    */   }
/*    */   public void print(long v) {
/* 55 */     if (this.forceQuoting) { printQuoted(Long.toUnsignedString(ULong.constructor-impl(v))); } else { print(Long.toUnsignedString(ULong.constructor-impl(v))); }
/*    */   
/*    */   }
/*    */   public void print(byte v) {
/* 59 */     if (this.forceQuoting) { printQuoted(UByte.toString-impl(UByte.constructor-impl(v))); } else { print(UByte.toString-impl(UByte.constructor-impl(v))); }
/*    */   
/*    */   }
/*    */   public void print(short v) {
/* 63 */     if (this.forceQuoting) { printQuoted(UShort.toString-impl(UShort.constructor-impl(v))); } else { print(UShort.toString-impl(UShort.constructor-impl(v))); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\ComposerForUnsignedNumbers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
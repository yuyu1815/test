/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\020\002\n\000\n\002\020\016\n\000\b\001\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnquotedLiterals;", "Lkotlinx/serialization/json/internal/Composer;", "writer", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "forceQuoting", "", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Z)V", "printQuoted", "", "value", "", "kotlinx-serialization-json"})
/*    */ @SuppressAnimalSniffer
/*    */ public final class ComposerForUnquotedLiterals
/*    */   extends Composer
/*    */ {
/*    */   private final boolean forceQuoting;
/*    */   
/*    */   public ComposerForUnquotedLiterals(@NotNull InternalJsonWriter writer, boolean forceQuoting) {
/* 68 */     super(writer); this.forceQuoting = forceQuoting;
/*    */   } public void printQuoted(@NotNull String value) {
/* 70 */     Intrinsics.checkNotNullParameter(value, "value"); if (this.forceQuoting) { super.printQuoted(value); } else { print(value); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\ComposerForUnquotedLiterals.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
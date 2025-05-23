/*    */ package ai.grazie.model.jet;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\004\bÆ\002\030\0002\0020\001:\002\003\004B\007\b\002¢\006\002\020\002¨\006\005"}, d2 = {"Lai/grazie/model/jet/JetModel$All;", "", "()V", "Medium", "Small", "model-jet"})
/*    */ public final class All {
/*    */   @NotNull
/*    */   public static final All INSTANCE = new All();
/*    */   
/*    */   @Deprecated(message = "Use Medium instead", replaceWith = @ReplaceWith(expression = "Medium", imports = {}))
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/jet/JetModel$All$Small;", "Lai/grazie/model/jet/JetModel;", "()V", "id", "", "getId", "()Ljava/lang/String;", "model-jet"})
/*    */   public static final class Small extends JetModel {
/* 15 */     private Small() { super(null); } @NotNull
/* 16 */     public static final Small INSTANCE = new Small(); @NotNull private static final String id = "jet-all-small"; @NotNull public String getId() { return id; }
/*    */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/jet/JetModel$All$Medium;", "Lai/grazie/model/jet/JetModel;", "()V", "id", "", "getId", "()Ljava/lang/String;", "model-jet"})
/* 18 */   public static final class Medium extends JetModel { private Medium() { super(null); } @NotNull
/* 19 */     public static final Medium INSTANCE = new Medium(); @NotNull private static final String id = "jet-all-medium"; @NotNull public String getId() { return id; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-jet-jvm-0.4.32.jar!\ai\grazie\model\jet\JetModel$All.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
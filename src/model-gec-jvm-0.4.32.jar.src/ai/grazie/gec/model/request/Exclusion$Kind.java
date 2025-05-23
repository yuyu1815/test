/*    */ package ai.grazie.gec.model.request;
/*    */ @Serializable(with = Exclusion.Kind.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\006\b\001\030\000 \0052\b\022\004\022\0020\0000\001:\002\005\006B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004¨\006\007"}, d2 = {"Lai/grazie/gec/model/request/Exclusion$Kind;", "", "(Ljava/lang/String;I)V", "Unknown", "Markup", "Companion", "Serializer", "model-gec"})
/*    */ public enum Kind {
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/request/Exclusion$Kind$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/request/Exclusion$Kind;", "model-gec"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Exclusion.Kind> serializer() {
/*    */       return (KSerializer<Exclusion.Kind>)Exclusion.Kind.Serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/* 18 */   Unknown,
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 24 */   Markup; static { Companion = new Companion(null); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/gec/model/request/Exclusion$Kind$Serializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/gec/model/request/Exclusion$Kind;", "()V", "model-gec"})
/*    */   public static final class Serializer extends StringValueClassSerializer<Kind> { @NotNull
/* 26 */     public static final Serializer INSTANCE = new Serializer(); private Serializer() { super(
/* 27 */           "Exclusion", 
/* 28 */           null.INSTANCE, 
/* 29 */           null.INSTANCE); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\request\Exclusion$Kind.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
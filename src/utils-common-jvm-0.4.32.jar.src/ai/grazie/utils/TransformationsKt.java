/*    */ package ai.grazie.utils;
/*    */ import java.util.Iterator;
/*    */ import java.util.LinkedHashSet;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\002\020\016\n\002\030\002\n\000\032*\020\000\032\022\022\004\022\0020\0020\001j\b\022\004\022\0020\002`\003*\022\022\004\022\0020\0020\001j\b\022\004\022\0020\002`\003¨\006\004"}, d2 = {"distinctByMaxPrefix", "Ljava/util/LinkedHashSet;", "", "Lai/grazie/utils/LinkedSet;", "utils-common"})
/*    */ public final class TransformationsKt {
/*    */   @NotNull
/*    */   public static final LinkedHashSet<String> distinctByMaxPrefix(@NotNull LinkedHashSet $this$distinctByMaxPrefix) {
/* 12 */     Intrinsics.checkNotNullParameter($this$distinctByMaxPrefix, "<this>"); LinkedHashSet<String> result = new LinkedHashSet(); int i; Boolean[] arrayOfBoolean1;
/* 13 */     for (byte b = 0; b < i; ) { byte b1 = b; arrayOfBoolean1[b1] = Boolean.valueOf(false); b++; }  Boolean[] processed = arrayOfBoolean1;
/* 14 */     for (Iterator<String> iterator = $this$distinctByMaxPrefix.iterator(); iterator.hasNext(); ) { int j = i; i++; String value = iterator.next();
/* 15 */       if (!processed[j].booleanValue()) {
/*    */         
/* 17 */         String current = value;
/* 18 */         processed[j] = Boolean.valueOf(true); Iterator<String> iterator1; int k;
/* 19 */         for (iterator1 = $this$distinctByMaxPrefix.iterator(), k = 0; iterator1.hasNext(); ) { int candidateI = k; k++; String candidate = iterator1.next();
/* 20 */           if (!processed[candidateI].booleanValue()) {
/*    */             
/* 22 */             if (StringsKt.startsWith$default(candidate, current, false, 2, null)) {
/* 23 */               processed[candidateI] = Boolean.valueOf(true);
/* 24 */               current = candidate; continue;
/* 25 */             }  if (StringsKt.startsWith$default(current, candidate, false, 2, null))
/* 26 */               processed[candidateI] = Boolean.valueOf(true); 
/*    */           }  }
/*    */         
/* 29 */         result.add(current);
/*    */       }  }
/* 31 */      return result;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\TransformationsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */